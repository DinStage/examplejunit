package ru.dubrovin.alishevtesting.test;

import org.junit.Test;
import ru.dubrovin.alishevtesting.MyMath;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

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