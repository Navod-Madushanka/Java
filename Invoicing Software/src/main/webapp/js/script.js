function addInput(){
    const userid = document.getElementById('user').value;
    const productid = document.getElementById('product').value;
    const qty = document.getElementById('qty').value;

    let request = new XMLHttpRequest();
    request.open('post','insert');
    request.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
    request.send(`userid=${userid}&productid=${productid}&qty=${qty}`);
}