package ru.dubrovin.alishevtesting.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import ru.dubrovin.alishevtesting.Vector2D;
import ru.dubrovin.exampleTest.Sex;
import ru.dubrovin.exampleTest.User;

import static org.junit.jupiter.api.Assertions.*;

class Vector2DTest {
    Vector2D v1 = new Vector2D(); // action

    @Test
    public  void  newVectorSholdHaveZeroLength() {
        //assertion
        //1e-9) = 000000001

        Assert.assertEquals(0 , v1.length() , 1e-9);  // ожидание , факт , точность (задаем для вещественных чисел)
    }
    @Test
    public  void  newVectorSholdHaveZeroX() {

        Assert.assertEquals(0 , v1.getX() , 1e-9);
    }
    @Test
    public  void  newVectorSholdHaveZeroY() {

        Assert.assertEquals(0 , v1.getX() , 1e-9);
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