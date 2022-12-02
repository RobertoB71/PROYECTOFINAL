let baseUrl="http://localhost:8080";

function RegistrarUsuario(){
    let data = {
        correo:document.getElementById("correo").value,
        nombre:document.getElementById("nombre").value,
        apellido:document.getElementById("apellido").value,
        contraseña:document.getElementById("contraseña").value
    };

    fetch(baseUrl+"/Registro",{
        method:"POST",
        body: JSON.stringify(data),
        headers:{
            "Content-type":'application/json; charset=UTF-8'
        }
    });
}