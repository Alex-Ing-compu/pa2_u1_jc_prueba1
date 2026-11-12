package com.jc.interceptor;

import com.jc.Pedido;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor 
@MedirTiempo 
public class MedirTiempoInterceptor {

    @AroundInvoke
    public Object medirTiempo(InvocationContext context) throws Exception {
        long inicio = System.currentTimeMillis();
        
        String codigo = "Nuevo no conocido";
        for (Object param : context.getParameters()) {
            if (param instanceof Pedido) {
                codigo = ((Pedido) param).getCodigo();
                break;
            }
        }

        try {
            Object resultado = context.proceed();
            long fin = System.currentTimeMillis();
            long tiempo = fin - inicio;

            System.out.println("Duracion:" + codigo + "  listo");
            System.out.println("Timpo:" + tiempo + " hecho");
            
            return resultado;
        } catch (Exception e) {
            throw e;
        }
    }
}
