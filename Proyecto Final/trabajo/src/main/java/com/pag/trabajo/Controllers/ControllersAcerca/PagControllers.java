package com.pag.trabajo.Controllers.ControllersAcerca;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pag.trabajo.Models.ModelsAcerca.Pag;
import com.pag.trabajo.Services.ServicesAcerca.PagDb;

@CrossOrigin
@RestController
public class PagControllers {

    @GetMapping("/pag/all")
    public List<Pag> ObtenerInfo(){
        return new PagDb().ObtenerInfo();
    }
}
