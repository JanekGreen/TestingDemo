package com.sda.person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonCreatorTest {
    private PersonCreator personCreator;

    @BeforeEach // it runs before each test
    public void setUp() {
        personCreator = new PersonCreator();
    }
    @Test
    public void shouldCreatePersonBasedAllParameters(){
        Person person = personCreator.make("Janek", "Green", 32, 'M');
        Assertions.assertEquals("Janek", person.getName());
        Assertions.assertEquals("Green", person.getSurname());
        Assertions.assertEquals(32, person.getAge());
        Assertions.assertEquals('M', person.getGender());
    }

}