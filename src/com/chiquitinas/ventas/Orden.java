package com.chiquitinas.ventas;

import java.text.DecimalFormat;
import java.util.Calendar;

public class Orden {

    private final int idOrden;
    private final Producto productos[];
    private final Calendar fechaCreacion = Calendar.getInstance();
    private Cliente cliente;
    private static int contadorOrdenes;
    private int contadorProductos;
    private final static int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes; // INCREMENTO DEL CONTADOR
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el máximo de productos: " + Orden.MAX_PRODUCTOS);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            Producto producto = this.productos[i];
            total += producto.getPrecio(); // SUMA TODOS LOS PRECIOS
        }
        return total;
    }

    public void imprimirOrden() {
        System.out.println("*********************CHIQUITINAS S.A*********************");
        System.out.println("=========================================================");
        System.out.println("| ORDEN #" + this.idOrden);
        System.out.println("| FECHA: " + this.fechaCreacion.getTime());
        System.out.println("| ID CLIENTE: " + this.cliente.getIdCliente());
        System.out.println("| CLIENTE: " + this.cliente.getNombre());
        System.out.println("| DIRECCIÓN: " + this.cliente.getDireccion());
        System.out.println("| TELÉFONO: " + this.cliente.getTelefono());

        if (!this.cliente.mostrarRepresentante().equals("")) {
            System.out.println("| REPRESENTANTE: " + this.cliente.mostrarRepresentante()); // SI EL REPRESENTANTE ESTÁ VACÍO NO SE MUESTRA
        }

        System.out.println("=========================================================");
        System.out.println("| ITEM\tCÓDIGO\tCANT.\tDESCRIPCIÓN\tPRECIO\tSUBTOTAL");
       
        for (int i = 0; i < this.contadorProductos; i++) {
            int item = i + 1;
            System.out.print("| #" + item);
            System.out.println(this.productos[i]);
        }
        double totalOrden = this.calcularTotal();
        System.out.println("=========================================================");
        DecimalFormat df = new DecimalFormat("###.##"); // REDONDEA A 2 DECIMALES
        System.out.println("| SUBTOTAL:\t\t\t\t\t$" + df.format(totalOrden));
        System.out.println("| I.V.A:\t\t\t\t\t$" + df.format((totalOrden * 1.13) - totalOrden)); // CALCULANDO EL IVA
        System.out.println("| MONTO TOTAL:\t\t\t\t\t$" + df.format(totalOrden * 1.13));
        System.out.println("=========================================================");
        System.out.println("| Gracias por su preferencia, vuelva pronto.");
        System.out.println("");
        System.out.println("");
    }
}
