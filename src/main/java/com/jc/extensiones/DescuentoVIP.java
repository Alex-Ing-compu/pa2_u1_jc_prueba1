package com.jc.extensiones;

import com.jc.interceptor.TipoCliente;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped 
@Named ("VIP")
public class DescuentoVIP implements Descuento {
    @Override
    public double calcularTotal(double valorOriginal) {
        return valorOriginal * 0.90;
    }
}