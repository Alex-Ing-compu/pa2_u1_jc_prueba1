package com.jc;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class NotificacionService {
    public void enviarNotificacion(String codigoPedido) {
        System.out.println("NOTIFICACION:");
        System.out.println("Enviando notigficacion por MAIL:" + codigoPedido);
    }
}