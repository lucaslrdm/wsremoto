function logar(){
    var objeto = {
        "email": document.getElementById("txtemail").value ,
        "senha": document.getElementById("txtsenha").value
    }

    var cabecalho = {
        method: "POST",
        body: JSON.stringify(objeto),
        headers: {
            "Content-type": "application/json"
        }
    }

    fetch("http://localhost:8080/login", cabecalho)
        .then(res => res.json())
        .then(res => {
            localStorage.setItem("logado", JSON.stringify(res));
            window.location="usuario.html"
        })
        .catch(err => {
            window.alert("Usuário/Senha invalidos");
        });

    }

function carregarusuario(){
    var usuariologado = localStorage.getItem("logado");
    if (usuariologado==null){
        window.location="login.html";
    }else{
        var usuariojson = JSON.parse(usuariologado);
        document.getElementById("foto").innerHTML = 
        "<img width='25%' height='25%' alt='Foto não encontrada' src=../imagens/" + usuariojson.foto + ">";
        document.getElementById("dados").innerHTML = 
        "<h3>" + usuariojson.nome + "<br>" + usuariojson.email + "<br>ID: " + usuariojson.id+ "<br></h3>";
        
    }

}

function carregarartistas(){
    fetch("http://localhost:8080/artistas")
        .then(res => res.json())
        .then(res => preencherartistas(res));
    
}


function cadastrarusuario(){

    var objeto = {
        nome : document.getElementById("txtnome").value,
        email : document.getElementById("txtemail").value,
        senha : document.getElementById("txtsenha").value,
        foto : document.getElementById("txtfoto").value

    }

    var cabecalho = {
        method : "POST",
        body : JSON.stringify(objeto),
        headers : {
            "Content-type" : "application/json"
        }
    }

    fetch ("http://localhost:8080/cadastrousuario", cabecalho)
        .then(res => res.json())
        .then(res => {window.alert("Gravado com sucesso")})
        .catch(err => {window.alert("ocorreu um erro")});

}