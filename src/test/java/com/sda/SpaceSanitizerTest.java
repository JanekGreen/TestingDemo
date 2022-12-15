package com.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpaceSanitizerTest {
    @Test
    void shouldRemoveSpaces(){
        SpaceSanitizer spaceSanitizer = new SpaceSanitizer();
        Assertions.assertEquals("AlaMaKota,AKotMaAlę!", spaceSanitizer.removeSpaces("Ala ma kota, a  kot ma Alę !"));
    }
    @Test
    void shlouldRemoveSpacesAndCapitalizeLetter(){
        SpaceSanitizer spaceSanitizer = new SpaceSanitizer();
        Assertions.assertEquals("JanekLubiPierogi", spaceSanitizer.removeSpaces("Janek lubi   pierogi"));
    }
    @Test
    void shlouldReturnTheSameString(){
        SpaceSanitizer spaceSanitizer = new SpaceSanitizer();
        Assertions.assertEquals("lóżko", spaceSanitizer.removeSpaces("lóżko"));
    }

}