package com.pag.trabajo.Controllers.ControllersContacto;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pag.trabajo.Models.ModelsContacto.Contac;
import com.pag.trabajo.Services.ServicesContacto.ContactDb;

@CrossOrigin
@RestController
public class ContactControllers {
    @GetMapping("/contacto/todo")
    public List<Contac> ObtenerContactos(){
        return new ContactDb().ObtenerContacto();
    }

    @PostMapping("/contacto")
    public int InsertarContacto(@RequestBody Contac contacto){
        return new ContactDb().GuardarContacto(contacto);
    }
}
