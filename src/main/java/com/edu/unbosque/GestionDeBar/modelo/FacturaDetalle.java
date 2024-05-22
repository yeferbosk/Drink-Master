package com.edu.unbosque.GestionDeBar.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FacturaDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String codigoBebida;
    private String nombreBebida;
    private int cantidad;
    private int precioUnitario;
    private int subTotal;
    private String descuento;
    private int subTotalDescuento;
    private int impuestos;
    private int totalLinea;

    public String getCodigoBebida() {
        return codigoBebida;
    }

    public void setCodigoBebida(String codigoBebida) {
        this.codigoBebida = codigoBebida;
    }

    public String getNombreBebida() {
        return nombreBebida;
    }

    public void setNombreBebida(String nombreBebida) {
        this.nombreBebida = nombreBebida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public int getSubTotalDescuento() {
        return subTotalDescuento;
    }

    public void setSubTotalDescuento(int subTotalDescuento) {
        this.subTotalDescuento = subTotalDescuento;
    }

    public int getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(int impuestos) {
        this.impuestos = impuestos;
    }

    public int getTotalLinea() {
        return totalLinea;
    }

    public void setTotalLinea(int totalLinea) {
        this.totalLinea = totalLinea;
    }
}
