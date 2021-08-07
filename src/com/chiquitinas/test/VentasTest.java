package com.chiquitinas.test;

import com.chiquitinas.ventas.Cliente;
import com.chiquitinas.ventas.Fisico;
import com.chiquitinas.ventas.Juridico;
import com.chiquitinas.ventas.Orden;
import com.chiquitinas.ventas.Producto;

public class VentasTest {

    public static void main(String[] args) {
        Cliente cliente1 = new Fisico("Jeffrey", 60265671, "Mozotal");
        Cliente cliente2 = new Juridico("Jeffrey", "Mariela", 60265671, "Guadalupe");
        var producto1 = new Producto("CAMISA 1", 100, 1);
        var producto2 = new Producto("CAMISA 2", 50, 2);
        var producto3 = new Producto("TELEVISOR", 113, 1);
        var producto4 = new Producto("FREIDORA", 89, 1);
        var producto5 = new Producto("PLANCHA ", 23, 2);

        var orden1 = new Orden();
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto5);
        orden1.agregarCliente(cliente1);
        orden1.imprimirOrden();

        var orden2 = new Orden();
        orden2.agregarCliente(cliente2);
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto1);
        orden2.imprimirOrden();
    }

}
