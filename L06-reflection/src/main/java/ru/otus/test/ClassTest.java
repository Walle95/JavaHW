package ru.otus.test;

import ru.otus.Test;
import java.util.HashMap;

public class ClassTest {

    int ResultTest; //результат теста (0 - good, 1 - bad)

    //Сделаю мапу с машинками, на которой буду испытывать свои тесты
    HashMap<String, Integer> myHashMap = new HashMap<>();

    //метод для добавления заранее заданных машин в мапу
    public void putCar(){
        myHashMap.put("Ford", 1_900_000);
        myHashMap.put("Toyota", 2_700_000);
        myHashMap.put("Honda", 2_300_000);
     }

    //метод для поиска цены по бренду авто
    public Integer getPriceCar (String brend){
           return myHashMap.get(brend);
    }
}


