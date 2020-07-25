package ru.otus;

import java.util.Iterator;

class SimpleIterator<E> implements Iterator<E>{

    private E[] values;
    private int index = 0;

    SimpleIterator(E[] objects){
        this.values = objects;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public E next() {
        return values[index++];
    }
}
