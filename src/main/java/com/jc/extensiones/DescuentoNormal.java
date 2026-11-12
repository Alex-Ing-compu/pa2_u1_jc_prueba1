package com.jc.extensiones;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped 
@Named ("NORMAL")
public class DescuentoNormal implements Descuento {
    @Override
    public double calcularTotal(double valorOriginal) {
        return valorOriginal;
    }
}