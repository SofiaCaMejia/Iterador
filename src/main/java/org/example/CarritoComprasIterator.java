package org.example;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class CarritoComprasIterator<T extends Valorable> implements Iterator<T> {
    private List<T> items;
    private int posicion = 0;
    private double minimo;
    private boolean Eliminar;

    public CarritoComprasIterator(List<T> items, double minimo) {
        this.items = items;
        this.minimo = minimo;
    }

    @Override
    public boolean hasNext() {
        while (posicion < items.size()
           && items.get(posicion).getPrecio()<= minimo) {
         posicion++;

            }
        return posicion < items.size();
    }
    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Eliminar =  true;
        return items.get(posicion++);
    }
    @Override
    public void remove() {
        if (!Eliminar) {
            throw new IllegalStateException("primero llamar a next() antes que remove()");
        }
        items.remove(--posicion);
        Eliminar = false;
    }
}
