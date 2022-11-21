function search(){
    let textSearch = document.getElementById('searchInput').value
    document.location.href = 'results.html?query=' + textSearch;
}