package com.jc;

import com.jc.extensiones.Descuento;
import com.jc.extensiones.DescuentoVIP;
import com.jc.interceptor.MedirTiempo;
import com.jc.interceptor.TipoCliente;

import io.quarkus.arc.runtime.BeanContainer.Instance;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Any;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped 
public class ProcesarPedidos {

    @Inject
    @Named("VIP")
    private Descuento descuentoVip;

    @Inject
    @Named("NORMAL")
    private Descuento descuentoNormal;

    @Inject
    @Named("EMPLEADO")
    private Descuento descuentoEmpleado;

    @Inject
    private NotificacionService notificacionService;

    @MedirTiempo 
    public void procesar(Pedido pedido) {
        
        Descuento estrategia;

        switch (pedido.getTipoCliente().toUpperCase()) {
            case "VIP":
                estrategia = descuentoVip;
                break;
            case "EMPLEADO":
                estrategia = descuentoEmpleado;
                break;
            case "NORMAL":
            default:
                estrategia = descuentoNormal;
                break;
        }

        double total = estrategia.calcularTotal(pedido.getValorOriginal());

        System.out.println("Pedido:" + pedido.getCodigo());
        System.out.println("Total: " + total);
        this.notificacionService.enviarNotificacion(pedido.getCodigo());
    }
}