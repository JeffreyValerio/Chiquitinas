package com.chiquitinas.ventas;

import java.text.DecimalFormat;

public class Producto {

    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    private int cantidadProductos;

    private Producto() {
        this.idProducto = ++Producto.contadorProductos; // INICIA EL CONTADOR
    }

    public Producto(String nombre, double precio, int cantidad) {
        this(); // LLAMA EL CONSTRUCTOR PRINCIPAL PARA INICIAR EL CONTADOR
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadProductos = cantidad;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio * cantidadProductos;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    public static void setContadorProductos(int contadorProductos) {
        Producto.contadorProductos = contadorProductos;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\tC102").append(idProducto);
        sb.append("\t").append(cantidadProductos);
        sb.append("\t").append(nombre);
        sb.append("\t$").append(precio);
        DecimalFormat df = new DecimalFormat("###.##");
        sb.append("\t$").append(df.format(precio * cantidadProductos));
        return sb.toString();
    }

}
