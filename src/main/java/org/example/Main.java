package org.example;

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
        for(Producto1 producto1 : carrito){
            System.out.println(producto1);
        }


    }

}