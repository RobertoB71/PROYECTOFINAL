let baseUrl="http://localhost:8080";

function Login(){
let data = {
    correo: document.getElementById("correo").value,
    contraseña: document.getElementById("contraseña").value
};

fetch(baseUrl +"/Log/login",{
    method: "POST",
    body:JSON.stringify(data),
    headers: {
        "Content-type": 'application/json; charset=UTF-8'
    }
}).then(res=>{
    res.json().then(json =>{
        console.log(json);
        if(json==1){
            window.location.href = "/perfil.html";
        }
    });
});
}