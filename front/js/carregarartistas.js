function carregarartistas() {
    fetch("http://localhost:8080/artistas")
        .then(res => res.json())
        .then(res => preencherartistas(res));

}
