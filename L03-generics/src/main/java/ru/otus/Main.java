package ru.otus;

import java.util.*;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        DIYArrayList<Integer> MyArray = new DIYArrayList<Integer>();
        MyArray.add(5);
        MyArray.add(4);
        MyArray.add(10);
        MyArray.add(1);
        MyArray.add(2);
        MyArray.add(4);
        MyArray.add(3);
        MyArray.add(9);
        MyArray.add(7);


        Collections.sort(MyArray);
        for (Integer str: MyArray) {
            System.out.print(" " + str);
        }



      //  System.out.println(MyArray);
        //System.out.println(MyArray.get(1));
        //System.out.println(MyArray.get(2));
    }


}


