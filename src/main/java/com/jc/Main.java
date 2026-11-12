package com.jc;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain 
public class Main implements QuarkusApplication{


    @Inject
    private ProcesarPedidos procesadorPedidos;
    public static void main(String[] args){

        Quarkus.run(Main.class,args);

    }

    @Override
    public int run(String... args) throws Exception {
        
        System.out.println("hola mundo  ");

        Pedido p1 = new Pedido("P001", "Laptop", 1000.00, "VIP");
        Pedido p2 = new Pedido("P002", "Mouse", 100.00, "NORMAL");
        Pedido p3 = new Pedido("P003", "Teclado", 200.00, "VIP");
  
        this.procesadorPedidos.procesar(p1);

        this.procesadorPedidos.procesar(p2);
        this.procesadorPedidos.procesar(p3);

        System.out.println("172219-ec");

        return 0;
    }

}
