package org.example;

public class Producto1 implements Valorable {
    private String codigo;
    private String nombre;
    private double precio;

    public Producto1(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }

    @Override
    public double getPrecio() { return precio; }

    @Override
    public String toString() {
        return nombre + " ($" + precio + ")";
    }
}