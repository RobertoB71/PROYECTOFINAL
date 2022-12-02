package com.pag.trabajo.Controllers.ControllersLogin;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pag.trabajo.Models.ModelsLogin.Login;
import com.pag.trabajo.Services.ServicesLogin.LoginDb;


@CrossOrigin
@RestController
public class LoginControllers {


   
    @PostMapping("/Log/login")
    public int LoginUser(@RequestBody Login log){
        return new LoginDb().LoginUser(log);
    }

    @PostMapping("/Registro")
    public int RegistroUser(@RequestBody Login log){
        return new LoginDb().RegistroUser(log);
    }
}

