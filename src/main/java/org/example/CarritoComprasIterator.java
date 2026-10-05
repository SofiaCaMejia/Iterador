package org.example;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class CarritoComprasIterator<T extends Valorable> implements Iterator<T> {
    private List<T> items;
    private int posicion = 0;
    private double minimo;

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
        return items.get(posicion++);
    }
}
