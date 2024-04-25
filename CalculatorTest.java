/*
STUDENT NUMBER: B211202050
FIRST AND LAST NAME: HALİT ERTAŞ
COURSE NAME: SOFTWARE VERIFICATION AND VALIDATION
ASSIGNMENT INFO: HOMEWORK 1, each student is expected to create a data-driven test (parameterized test) using
JUnit5.

 */







package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "10, 2, 5",
            "10, 4, 2.5f",
            "12.5f, 2.5f, 5",
            "10, 2.5f, 4",
            "12.5f, 5, 2.5f"
    })
    public void testDivision1(float num1, float num2, float expectedValue){
        var value = Calculator.divide(num1, num2);
        assertEquals(expectedValue, value);
    }
}