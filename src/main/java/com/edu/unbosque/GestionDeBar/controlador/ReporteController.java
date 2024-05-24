package com.edu.unbosque.GestionDeBar.controlador;

import com.edu.unbosque.GestionDeBar.modelo.Cliente;
import com.edu.unbosque.GestionDeBar.modelo.Proveedor;
import com.edu.unbosque.GestionDeBar.servicio.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bares-app/controllerReporte")
@CrossOrigin(value = "http://localhost:4200")
public class ReporteController {
    @Autowired
    private ReporteService reporteService;
    @GetMapping("/clientes-mayor-gasto")
    public ResponseEntity<List<Cliente>> obtenerClientesMayorGasto() {
        List<Cliente> clientes = reporteService.obtenerClientesMayorGasto();
        return ResponseEntity.ok(clientes);
    }

    @GetMapping("/proveedores-mayor-compras")
    public ResponseEntity<List<Proveedor>> obtenerProveedoresMayorCompras() {
        List<Proveedor> proveedores = reporteService.obtenerProveedoresMayorCompras();
        return ResponseEntity.ok(proveedores);
    }

}