package ru.dubrovin.alishevtesting.test;

import org.junit.Test;
import ru.dubrovin.alishevtesting.MyMath;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    @Test
    void devide() {

    }
    @Test (expected = ArithmeticException.class )
    void zeroDenominatorShouldTrowException(){
        MyMath.devide(1 , 0);


    }
}