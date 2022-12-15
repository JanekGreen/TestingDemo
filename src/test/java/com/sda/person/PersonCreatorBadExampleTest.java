package com.sda.person;

import org.junit.jupiter.api.*;

class PersonCreatorBadExampleTest {
    private PersonCreator personCreator;

    @BeforeAll
    static void beforeAll(){
        System.out.println("before all");
    }
    @BeforeEach // wykonuje się przed każdym przypadkiem testowym
    public void setUp() {
        System.out.println("set up method");
        personCreator = new PersonCreator();
    }
    @Test
    public void shouldCreatePersonWhenGenderFemaleNameNull(){
        Person person = personCreator.make(null, "Green", 32, 'F');
        Assertions.assertEquals("Kobieta", person.getName());
        Assertions.assertEquals("Green", person.getSurname());
        Assertions.assertEquals(32, person.getAge());
        Assertions.assertEquals('F', person.getGender());
        Assertions.assertEquals(3, PersonCreator.getPersonCounter());
    }
    @Test
    public void shouldCreatePersonBasedAllParameters(){
        Person person = personCreator.make("Janek", "Green", 32, 'M');
        Assertions.assertEquals("Janek", person.getName());
        Assertions.assertEquals("Green", person.getSurname());
        Assertions.assertEquals(32, person.getAge());
        Assertions.assertEquals('M', person.getGender());
        Assertions.assertEquals(1, PersonCreator.getPersonCounter());
    }
    @AfterEach // wykonuje się przed każdym przypadkiem testowym
    public void cleanup() {
        System.out.println("cleanup up method");
    }

    @Test
    public void shouldCreatePersonWithAnonimSurname(){
        Person person = personCreator.make("Janek", null, 32, 'M');
        Assertions.assertEquals("Janek", person.getName());
        Assertions.assertEquals("Anonim", person.getSurname());
        Assertions.assertEquals(32, person.getAge());
        Assertions.assertEquals('M', person.getGender());
        Assertions.assertEquals(2, PersonCreator.getPersonCounter());
    }

    @AfterAll
    static void afterAll(){
        System.out.println("After all");
    }

}