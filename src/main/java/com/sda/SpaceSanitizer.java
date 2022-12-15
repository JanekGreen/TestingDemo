package com.sda;

public class SpaceSanitizer {
    //usuwamy spacje, następna litera po spacji jest duża
    //"Ala ma kota" -> AlaMaKota
    //Jaki, jaka, jakie -> Jaki,Jaka,Jakie
    String removeSpaces(String text) {
        String result = "";
        boolean isSpaceFound = false;
        for (char character : text.trim().toCharArray()) {
            if (character == ' ') {
                isSpaceFound = true;
            } else {
                if (isSpaceFound) {
                    result += String.valueOf(character).toUpperCase();
                    isSpaceFound = false;
                } else {
                    result += String.valueOf(character);
                }
            }
        }
        return result;
    }
}
