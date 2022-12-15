package com.sda.person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameStringTest {
    private NameString nameString;


    @Test
    public void shouldCreateNameMidelnameSurname(){
        nameString = new NameString("Barbara", "Katarzyna", "Wiesiołek");
        Assertions.assertEquals("Barbara", nameString.getName());
        Assertions.assertEquals("Katarzyna", nameString.getMiddleName());
        Assertions.assertEquals("Wiesiołek", nameString.getSurname());
    }

    @Test
    public void shouldReturnMidelNameIfIsyntNull (){
        NameString nameString = new NameString("Barbara", "Katarzyna", "Wisiołek");
        Assertions.assertEquals(true,nameString.hasMiddleName());

    }
    @Test
    public void shouldReturnMidelNameIfIsNull (){
        NameString nameString = new NameString("Barbara", null, "Wisiołek");
        Assertions.assertEquals(false,nameString.hasMiddleName());

    }
    @Test
    public void shoulReturnInitials (){
        NameString nameString = new NameString("Barbara", null, "Wisiołek");
        Assertions.assertEquals("BW",nameString.getInitials());

    }
    @Test
    public void shoulReturnFullName (){
        NameString nameString = new NameString("Barbara", "Katarzyna", "Wisiołek");
        Assertions.assertEquals("Barbara Katarzyna Wisiołek",nameString.getFullName());

    }

    @Test
    public void shoulReturnNameMidelNameAndSournameReturnInString (){
        NameString nameString = new NameString("Barbara", "Katarzyna", "Wisiołek");
        Assertions.assertEquals("Barbara Katarzyna Wisiołek",nameString.toString());

    }


}