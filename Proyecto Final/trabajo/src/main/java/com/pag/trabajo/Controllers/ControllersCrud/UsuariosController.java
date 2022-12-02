package com.pag.trabajo.Controllers.ControllersCrud;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pag.trabajo.Models.ModelsCrud.Usuarios;
import com.pag.trabajo.Services.ServicesCrud.UsuariosDb;
@RestController
public class UsuariosController {

  @GetMapping("/usuarios/all")
  public List<Usuarios> ObtenerTodosusuarios() {
    return new UsuariosDb().ObtenerUsuarios();
  }

  @PostMapping("/usuario")
  public int InsertarUsuario(@RequestBody Usuarios usuario) {
    return new UsuariosDb().GuardarUsuarios(usuario);
  }

  @PutMapping("/usuario")
  public int ActualizarUsuario(@RequestBody Usuarios usuario) {
    return new UsuariosDb().ActualizarUsuarios(usuario);
  }

  @DeleteMapping("/usuario/{usuarioId}")
  public int Delete(@PathVariable("UsuarioId") int pid) {
    return new UsuariosDb().EliminarUsuario(pid);
  }

}
