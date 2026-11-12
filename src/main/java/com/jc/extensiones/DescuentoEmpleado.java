package com.jc.extensiones;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped 
@Named ("EMPLEADO")
public class DescuentoEmpleado implements Descuento {
    @Override
    public double calcularTotal(double valorOriginal) {
        return valorOriginal * 0.80; 
    }
}