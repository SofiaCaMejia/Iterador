package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarritoCompras <T extends Valorable> implements Iterable<T>{

    private List<T> items = new ArrayList<>();

    public void agregar(T item) {
        items.add(item);
    }

    public T obtenerMayor() {
        if (items.isEmpty()) return null;
        T mayor = items.get(0);
        for (T item : items) {
            if (item.getPrecio() > mayor.getPrecio()) {
                mayor = item;
            }
        }
        return mayor;
    }

    public double calcularTotal() {
        double total = 0;
        for (T item : items) {
            total += item.getPrecio();
        }
        return total;
    }
    @Override
    public Iterator<T> iterator() {
        return new CarritoComprasIterator<>(items, 1000);
    }

}
