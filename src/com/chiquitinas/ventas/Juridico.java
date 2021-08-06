package com.chiquitinas.ventas;

public class Juridico extends Cliente {

    private String representante;

    public Juridico(String representante, String nombre, int telefono, String direccion) {
        super(nombre, telefono, direccion);
        this.representante = representante;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

}
