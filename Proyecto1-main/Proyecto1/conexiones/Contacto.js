let baseUrl="http://localhost:8080";
let contacto = [];

function GuardarContacto(){
    let data = {
        nombre:document.getElementById("nombre").value,
        correo:document.getElementById("correo").value,
        comentario:document.getElementById("comentario").value
    };
    fetch(baseUrl+"/contacto",{
        method:"POST",
        body: JSON.stringify(data),
        headers:{
            "Content-type":'application/json; charset=UTF-8'
        }
    });
}