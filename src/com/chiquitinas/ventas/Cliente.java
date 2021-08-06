package com.chiquitinas.ventas;

public abstract class Cliente {

    private final int idCliente;
    private String nombre;
    private int telefono;
    private String direccion;
    private static int contadorCliente;

    private Cliente() {
        this.idCliente = ++Cliente.contadorCliente;
    }

    public Cliente(String nombre, int telefono, String direccion) {
        this();
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String mostrarRepresentante() {
        if (this instanceof Juridico) {
            return ((Juridico) this).getRepresentante();
        } else {
            return "";
        }
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public static int getContadorCliente() {
        return contadorCliente;
    }

    public static void setContadorCliente(int contadorCliente) {
        Cliente.contadorCliente = contadorCliente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("idCliente=").append(idCliente);
        sb.append(", nombre=").append(nombre);
        sb.append(", telefono=").append(telefono);
        sb.append(", direccion=").append(direccion);
        return sb.toString();
    }
}
