package com.edu.unbosque.GestionDeBar.controlador;
import com.edu.unbosque.GestionDeBar.modelo.*;
import com.edu.unbosque.GestionDeBar.servicio.BebidasSerivicio;
import com.edu.unbosque.GestionDeBar.servicio.ClienteServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.edu.unbosque.GestionDeBar.servicio.BaresServicio;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/bares-app/controllerFactura")
@CrossOrigin(value = "http://localhost:4200")
public class FacturaController {

    @Autowired
    private BebidasSerivicio bebidasServicio;

    @Autowired
    private ClienteServicio clienteServicio;

    @PostMapping("/calcular-factura")
    public FacturaDetalle calcularFactura(@RequestBody FacturaRequest request) {
        Bebida bebida = bebidasServicio.buscarBebidaPorId(request.getIdBebida());
        Cliente cliente = clienteServicio.buscarClientePorId(request.getIdCliente());

        double descuento = 0.0;
        if ("Estudiante".equalsIgnoreCase(cliente.getOcupacion())) {
            descuento = 0.10;
        }
        if (cliente.getHistorialGasto() > 1000000) {
            descuento = 0.20;
        }

        int cantidad = request.getCantidad();
        long subTotal = bebida.getPrecio() * cantidad;
        long descuentoAplicado = (long) (subTotal * descuento);
        long subTotalDescuento = subTotal - descuentoAplicado;
        long impuestos = (long) (subTotalDescuento * 0.13);
        long totalLinea = subTotalDescuento + impuestos;

        FacturaDetalle detalle = new FacturaDetalle();
        detalle.setCodigoBebida(String.valueOf(bebida.getIdBebida()));
        detalle.setNombreBebida(bebida.getNombre());
        detalle.setCantidad(cantidad);
        detalle.setPrecioUnitario((int) bebida.getPrecio());
        detalle.setSubTotal((int) subTotal);
        detalle.setDescuento(String.valueOf(descuento * 100) + "%");
        detalle.setSubTotalDescuento((int) subTotalDescuento);
        detalle.setImpuestos((int) impuestos);
        detalle.setTotalLinea((int) totalLinea);

        return detalle;
    }
}