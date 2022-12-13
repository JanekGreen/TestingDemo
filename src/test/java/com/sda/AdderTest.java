package com.sda;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AdderTest {

    @Test
    void adderShouldReturnTwoNumbers(){
        //given
        Adder adder = new Adder();
        //when
        Integer result = adder.add(2, 4);
        //then
        Assertions.assertEquals(6, result);
    }
}