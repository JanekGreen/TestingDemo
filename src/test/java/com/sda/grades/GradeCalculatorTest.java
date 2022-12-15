package com.sda.grades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GradeCalculatorTest {
    /*
     * 100 - 90 % bdb
     * 89  - 79 % db
     * 78  - 69 % dst
     * 68  - 50 % dop
     * 49  - 0  % ndst
     * */

    @Test
    void shouldReturnBdb() {
        GradeCalculator gradeCalculator = new GradeCalculator();
        String result = gradeCalculator.calculate(90);
        Assertions.assertEquals("bdb", result);
    }
    @Test
    void shouldReturnDb() {
        GradeCalculator gradeCalculator = new GradeCalculator();
        String result = gradeCalculator.calculate(79);
        Assertions.assertEquals("db", result);
    }
    @Test
    void shouldReturnDstCeil() {
        GradeCalculator gradeCalculator = new GradeCalculator();
        String result = gradeCalculator.calculate(78);
        Assertions.assertEquals("dst", result);
    }
    @Test
    void shouldReturnDstFloor() {
        GradeCalculator gradeCalculator = new GradeCalculator();
        String result = gradeCalculator.calculate(69);
        Assertions.assertEquals("dst", result);
    }
    @Test
    void shouldReturnDop() {
        GradeCalculator gradeCalculator = new GradeCalculator();
        String result = gradeCalculator.calculate(50);
        Assertions.assertEquals("dop", result);
    }

    @Test
    void shouldReturnNdst() {
        GradeCalculator gradeCalculator = new GradeCalculator();
        String result = gradeCalculator.calculate(49);
        Assertions.assertEquals("ndst", result);
    }

    @Test
    void shouldReturnErrorIfPercentageAbove100() {
        GradeCalculator gradeCalculator = new GradeCalculator();
        String result = gradeCalculator.calculate(101);
        Assertions.assertEquals("Error. Percentage out of range!", result);
    }

    @Test
    void shouldReturnErrorIfPercentageBelow0() {
        GradeCalculator gradeCalculator = new GradeCalculator();
        String result = gradeCalculator.calculate(-1);
        Assertions.assertEquals("Error. Percentage out of range!", result);
    }

}