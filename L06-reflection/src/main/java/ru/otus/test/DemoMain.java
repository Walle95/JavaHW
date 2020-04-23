package ru.otus.test;

import ru.otus.Before;
import ru.otus.Test;

import java.lang.reflect.Method;

public class DemoMain {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("ru.otus.test.DemoTest");

        System.out.println("-----------------------");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods){
            System.out.println(method);
        }



        /*System.out.println("-----------------------");
        ClassTest classTest = new ClassTest();
        Method[] myMethod = clazz.getMethods();
        classTest.getPriceCar("Ford");*/



    }
}
