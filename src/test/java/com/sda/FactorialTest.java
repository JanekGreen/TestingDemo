package com.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    @Test
    public void shouldReturnFactorial(){
        int result = Factorial.fact(3);
        Assertions.assertEquals(6,result);
    }
    @Test
    public void shouldReturnFactorialFor6(){
        int result = Factorial.fact(6);
        Assertions.assertEquals(720,result);
    }


    @Test
    public void shouldReturnOneIfZero(){
        int result = Factorial.fact(0);
        Assertions.assertEquals(1,result);
    }
}
