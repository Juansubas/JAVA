//En esta función capturamos lo que esta buscando el usuario
// Luego redireccionamos a la pagina de resultados pasando el valor en la URL como peticion query
// Esto ocasiona que automaticamente el results capte dicho valor y organice los resultados
function search(){
    let textSearch = document.getElementById('searchInput').value
    document.location.href = 'results.html?query=' + textSearch;
}