document.getElementById('load').addEventListener('click', (e) => {

    let user = {
        name: "Hasitha",
        age: "23"
    }

    // console.log(user);

    let request = new XMLHttpRequest();
    request.open('post', 'a', false);
    request.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
    request.send("user="+JSON.stringify(user));


    // Bring response from /a servlet
    // request.onreadystatechange = function (){
    //     if(request.readyState == 4){
    //
    //     }
    // }
    //
    // request.onload = function (){
    //
    // }

    request.onloadend = function (){
        let data = JSON.parse(request.responseText);
        console.log(data);
    }
});

setInterval((e)=>{
    let element = document.createElement('h1');
    element.innerText = 'Hello';
    document.body.append(element);
},1000);