package com.edu.unbosque.GestionDeBar.controlador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.unbosque.GestionDeBar.modelo.Bar;
import com.edu.unbosque.GestionDeBar.servicio.BaresServicio;

import java.util.List;

@RestController
@RequestMapping("bares-app")
@CrossOrigin(value = "http://localhost:4200")
public class BaresControlador {

    private static final Logger logger = LoggerFactory.getLogger(BaresControlador.class);

    @Autowired
    private BaresServicio baresServicio;

    @GetMapping("/bares")
    public List<Bar> obtenerBares(){
        List<Bar> bares = this.baresServicio.listarBares();
        logger.info("Bares obtenidos:");
        bares.forEach((Bares -> logger.info(bares.toString())));
        return bares;
    }
}
