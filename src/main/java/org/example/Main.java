package org.example;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        CarritoCompras<Producto1> carrito = new CarritoCompras<>();
        carrito.agregar(new Producto1("P1", "Mouse", 500));
        carrito.agregar(new Producto1("P2", "Teclado", 1200));
        carrito.agregar(new Producto1("P3", "Monitor", 8000));

        System.out.println("Más caro: " + carrito.obtenerMayor());
        System.out.println("Total: $" + carrito.calcularTotal());

//        CarritoCompras<Producto1> vacio = new CarritoCompras<>();
//        System.out.println("Carrito vacío: " + vacio.obtenerMayor());

        System.out.println("Prductos Mayores 1000");
        for(Producto1 producto1 : carrito) {
            System.out.println(producto1);


        }
        Iterator<Producto1>  it = carrito.iterator();
        while(it.hasNext()) {
            Producto1 producto1 = it.next();
            System.out.println(producto1);

            if (producto1.getPrecio() < 2000) {
                it.remove();
                System.out.println("productos removidos");
            }
        }
    }

}