package com.edu.unbosque.GestionDeBar.servicio;

import com.edu.unbosque.GestionDeBar.modelo.Bebida;
import com.edu.unbosque.GestionDeBar.modelo.Cliente;
import com.edu.unbosque.GestionDeBar.modelo.Factura;
import org.springframework.stereotype.Service;

@Service
public class FacturaServicio {

    public Factura generarFactura(Cliente cliente, Bebida bebida, int disponibilidad) {
        Factura factura = new Factura();
        factura.setCodigoProducto(bebida.getIdBebida());
        factura.setNombreProducto(bebida.getNombre());
        factura.setCantidad(disponibilidad);
        factura.setPrecioUnitario(bebida.getPrecio());

        long subtotal = bebida.getPrecio() * disponibilidad;
        long descuento = calcularDescuento(cliente, subtotal);
        long impuestos = calcularImpuestos(subtotal - descuento);
        long total = subtotal - descuento + impuestos;

        factura.setSubtotal(subtotal);
        factura.setDescuento(descuento);
        factura.setImpuestos(impuestos);
        factura.setTotalLinea(total);

        return factura;
    }

    private long calcularDescuento(Cliente cliente, long subtotal) {
        long descuento = 0;
        if ("Estudiante".equalsIgnoreCase(cliente.getOcupacion())) {
            descuento += subtotal * 0.10;
        }
        if (cliente.getHistorialGasto() > 1000000) {
            descuento += subtotal * 0.20;
        }
        return descuento;
    }

    private long calcularImpuestos(long total) {
        return (long) (total * 0.19); // Ejemplo de impuesto del 19%
    }
} 		