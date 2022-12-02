let baseUrl = "http://localhost:8080";
let usuarios = [];

function Obtenerusuarios() {
  fetch(baseUrl + "/usuarios/all").then((res) => {
    res.json().then((json) => {
      usuarios = json;
      Imprimirusuarios();
    });
  });
}

function Imprimirusuarios() {
  let contenedor = document.getElementById("cuerpoTabla");
  contenedor.innerHTML = "";

  usuarios.forEach((usuario) => {
    contenedor.innerHTML += MapearUsuario(usuario);
  });
}

function MapearUsuario(usuario) {
  return `<tr>
  <td>
    <button class='btn btn-danger btn-sm' onclick="EliminarUsuario(${producto.id})">Eliminar</button>
    <button class='btn btn-warning btn-sm' onclick="PopularDatosCampos(${producto.id})">Actualizar</button>
    </td>
  <td>${usuario.correo}</td>
  <td>${usuario.nombre}</td>
  <td>${usuario.apellido}</td>
  <td>${usuario.teléfono}</td>
  <td>${usuario.contraseña}</td>
  <td>${producto.foto}</td>
</tr>`;
}

function EliminarUsuario(pid) {
  fetch(baseUrl + "/usuario/" + pid, { method: "Delete" }).then((res) => {
    console.log(res);
    Obtenerusuarios();
  });
}

function GuardarUsuario() {
  let data = {
    correo: document.getElementById("correo").value,
    nombre: document.getElementById("nombre").value,
    apellido: document.getElementById("apellido").value,
    telefono: document.getElementById("telefono").value,
    contraseña: document.getElementById("contraseña").value,
    foto: document.getElementById("foto").value,
    
  };

  fetch(baseUrl + "/usuario", {
    method: "POST",
    body: JSON.stringify(data),
    headers: {
      "Content-type": "application/json; charset=UTF-8",
    },
  }).then((res) => {
    Obtenerusuarios();
  });
}

function PopularDatosCampos(pid) {
  let usuario = usuarios.filter((p) => {
    return p.id == pid;
  })[0];

 document.getElementById("correo").value = usuario.correo;
  document.getElementById("nombre").value = usuario.nombre;
  document.getElementById("apellido").value = usuario.apellido;
 document.getElementById("telefono").value = usuario.telefono;
   document.getElementById("contraseña").value = usuario.contraseña;
document.getElementById("foto").value = usuario.foto;

}

function ActualizarProducto() {
  let data = {

    correo: document.getElementById("correo").value,
    nombre: document.getElementById("nombre").value,
    apellido: document.getElementById("apellido").value,
    telefono: document.getElementById("telefono").value,
    contraseña: document.getElementById("contraseña").value,
    foto: document.getElementById("foto").value,

  };

  fetch(baseUrl + "/usuario", {
    method: "PUT",
    body: JSON.stringify(data),
    headers: {
      "Content-type": "application/json; charset=UTF-8",
    },
  }).then((res) => {
    Obtenerusuarios();
  });
}
