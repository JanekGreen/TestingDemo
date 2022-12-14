package com.sda;

import com.sda.person.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class AssertionsExamples {
    @Test
    void assertionsExamples(){
        int a = 2 * 2;
        int b = 4;
        Assertions.assertFalse(1 == 2);
        Assertions.assertTrue(a == b);
        Assertions.assertEquals(4, b);
        Assertions.assertNotEquals(5, b);
        Person person = null;
        Assertions.assertNull(person);
        //will fail
        //Assertions.assertNotNull(person);
        Assertions.assertArrayEquals(new int[]{1},new int[]{1});
        Assertions.assertIterableEquals(Arrays.asList(1), Arrays.asList(1));
        Assertions.assertSame("ala", "ala");
        Assertions.assertNotSame("ala", "ala");

    }
}
