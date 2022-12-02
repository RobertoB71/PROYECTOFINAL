package com.pag.trabajo.Controllers.ControllersReporte;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pag.trabajo.Models.ModelsReporte.reporte;
import com.pag.trabajo.Services.ServicesReporte.PagDb;

@CrossOrigin
@RestController
public class ReporteControllers {

    @GetMapping("/reporte/all")
    public List<reporte> ObtenerInfo(){
        return new PagDb().ObtenerInfo();
    }
}
