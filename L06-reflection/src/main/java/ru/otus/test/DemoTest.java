package ru.otus.test;

import ru.otus.After;
import ru.otus.Before;
import ru.otus.Test;



public class DemoTest {

    @Before
    public void MyBefore(){
        //логика

    }

    @Test
    public void MyTest(){
        //логика
    }

    @After
    public void MyAfter(){
        //логика
    }
}
