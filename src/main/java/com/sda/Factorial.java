package com.sda;

public class Factorial {
    //silnia
    public static int fact(int number) {
        int a = 1;
        if (number == 0) {
            return 1;
        } else {
            for (int i = 1; i <= number; i++) {
                a *= i;
            }
            return a;
        }
    }
}
