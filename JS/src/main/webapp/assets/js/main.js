document.getElementById('load').addEventListener('click', (e)=>{
    fetch('a',{
        method:'post',
        headers:{
            'name':'Navod',
            'Content-Type':'Application/json'
        },
        body:JSON.stringify({
            name:"ABC",
            age:"26"
        })
    }).then(e=>{
        console.log(e);
    });

})