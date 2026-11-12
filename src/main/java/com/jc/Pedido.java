package com.jc;

public class Pedido {

    private String codigo;
    private String producto;
    private double valorOriginal;
    private String tipoCliente;


    public Pedido(String codigo, String producto, double valorOriginal, String tipoCliente) {
        this.codigo = codigo;
        this.producto = producto;
        this.valorOriginal = valorOriginal;
        this.tipoCliente = tipoCliente;
        
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public double getValorOriginal() {
        return valorOriginal;
    }
    public void setValorOriginal(double valorOriginal) {
        this.valorOriginal = valorOriginal;
    }
    public String getTipoCliente() {
        return tipoCliente;
    }
    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }


   


   



}
