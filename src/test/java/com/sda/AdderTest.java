package com.sda;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AdderTest {
    /*nazwa metody powinna opisywać dobrze to co testujemy*/
    @Test
    void adderShouldAddTwoNumbers(){ // metoda z adnotacją test to jeden przypadek testowy
        //given
        Adder adder = new Adder();
        //when
        Integer result = adder.add(2, 4);
        //then
        Assertions.assertEquals(6, result);
    }
    @Test
    void adderShouldReturnNullWhenNumbersAreNull(){ // metoda z adnotacją test to jeden przypadek testowy
        //given
        Adder adder = new Adder();
        //when
        Integer result = adder.add(null, null);
        //then
        Assertions.assertNull(result);
    }
    @Test
    void adderShouldReturnNullWhenOneNumberIsNull(){ // metoda z adnotacją test to jeden przypadek testowy
        //given
        Adder adder = new Adder();
        //when
        Integer result = adder.add(5, null);
        //then
        Assertions.assertNull(result);
    }
}