package com.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubtractorTest {
    @Test
    void subtractorShouldSubtractNumbers(){
        //given
        Subtractor subtractor = new Subtractor();
        //when
       int result = subtractor.subtract(5, 3);
       //then
        Assertions.assertEquals(2, result);
        Assertions.assertNotEquals(3, result);

    }
}
