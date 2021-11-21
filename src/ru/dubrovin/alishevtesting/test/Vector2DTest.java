package ru.dubrovin.alishevtesting.test;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

import ru.dubrovin.alishevtesting.Vector2D;
import ru.dubrovin.exampleTest.Sex;
import ru.dubrovin.exampleTest.User;

import static org.junit.jupiter.api.Assertions.*;

class Vector2DTest {
    public static Vector2D v1;  // action
    public final  double EPS = 1e-9;
    @BeforeClass
    public  void createNewVector() {
        v1 = new Vector2D();
    }
    @Test
    public  void  newVectorSholdHaveZeroLength() {
        //assertion
        //1e-9) = 000000001

        Assert.assertEquals(0 , v1.length() , EPS);  // ожидание , факт , точность (задаем для вещественных чисел)
    }
    @Test
    public  void  newVectorSholdHaveZeroX() {

        Assert.assertEquals(0 , v1.getX() , EPS);
    }
    @Test
    public  void  newVectorSholdHaveZeroY() {

        Assert.assertEquals(0 , v1.getX() , EPS);
    }

    @Test
    void getX() {
    }

    @Test
    void setX() {
    }

    @Test
    void getY() {
    }

    @Test
    void setY() {
    }
}