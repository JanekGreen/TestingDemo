package com.sda.grades;

public class GradeCalculator {
    /*
     * 100 - 90 % bdb
     * 89  - 79 % db
     * 78  - 69 % dst
     * 68  - 50 % dop
     * 49  - 0  % ndst
     * */
    String calculate(int percentage) {
        if (percentage >= 90) {
            return "bdb";
        }
        if (percentage >= 79) {
            return "db";
        }
        if (percentage >= 69) {
            return "dst";
        }
        if (percentage >= 50) {
            return "dop";
        } else {
            return "ndst";
        }

    }
}
