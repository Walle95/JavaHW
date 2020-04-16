package ru.otus;

import java.util.*;
import java.util.function.UnaryOperator;


public class DIYArrayList<T> implements List<T>, Comparable<DIYArrayList>
{
    private T[] values;
    DIYArrayList(){
        values = (T[]) new Object[0];
    }


    ///////////////////////////////////////////
    @Override
    public int size() {
        return values.length;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator()  {

        return new SimpleIterator<>(values);
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] t1s) {
        return null;
    }

    @Override
    public boolean add(T t) {
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = t;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
        }


    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        return false;
    }

    @Override
    public boolean addAll(int i, Collection<? extends T> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator<T> operator) {

    }

    /*@Override
    public void sort(Comparator<? super T> c) {
        T[] temp2 = values;
        for(int i = values.length - 1 ; i > 0 ; i--) {
            for(int j = 0 ; j < i ; j++) {
                if(values[j] > values[j+1]) {
                    T tmp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = tmp;


                }
            }
        }
    }*/



    @Override
    public void clear() {

    }

   @Override
    public T get(int i) {
        return values[i];
    }

    @Override
    public T set(int i, T t) {
        return null;
    }

    @Override
    public void add(int i, T t) {

    }

    @Override
    public T remove(int i) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int i) {
        return null;
    }

    @Override
    public List<T> subList(int i, int i1) {
        return null;
    }



    @Override   //не могу понять, как прописать логику сравнения дженериков (полагаю - никак)

    public int compareTo(DIYArrayList Array1) {


        return Array1.compareTo(Array1);
    }
}