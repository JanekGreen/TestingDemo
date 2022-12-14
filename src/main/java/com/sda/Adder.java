package com.sda;

/*
*
* Konwencja nazewnictwa testu
* NazwaKlasyTest - AdderTest
*
* */
public class Adder  {
    public Integer add(Integer a, Integer b) {
        if(a == null || b == null){
            return null;
        }
        return a + b;
    }
}
