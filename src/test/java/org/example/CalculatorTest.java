package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(1, 2);
        Assertions.assertEquals(3, result);
    }

    @Test void testAddNegative() {
        Calculator calc = new Calculator();
        int result = calc.add(-1, 2);
        Assertions.assertEquals(1, result);
    }

    @Test
    void testSubtract() {
        Calculator calc = new Calculator();
        int result = calc.subtract(1, 2);
        Assertions.assertEquals(-1, result);
    }

    @Test
    void testSubtractNegative() {
        Calculator calc = new Calculator();
        int result = calc.subtract(-1, -2);
        Assertions.assertEquals(-3, result);
    }

    @Test
    void testMultiply() {
        Calculator calc = new Calculator();
        int result = calc.mulitply(2, 2);
        Assertions.assertEquals(4, result);
    }

    @Test
    void testMultiplyZero() {
        Calculator calc = new Calculator();
        int result = calc.mulitply(1, 0);
        Assertions.assertEquals(0, result);
    }

    @Test
    void testMultiplyNegative() {
        Calculator calc = new Calculator();
        int result = calc.mulitply(-2, -2);
        Assertions.assertEquals(4, result);
    }

    @Test
    void testDivide() {
        Calculator calc = new Calculator();
        int result = calc.divide(10, 2);
        Assertions.assertEquals(5, result);
    }

    @Test
    void testDivideNegative() {
        Calculator calc = new Calculator();
        int result = calc.divide(-2, -2);
        Assertions.assertEquals(1, result);
    }

    @Test
    void testDivideByZero() {
        Calculator calc = new Calculator();
        Assertions.assertThrows(IllegalArgumentException.class, () -> calc.divide(2, 0));
    }
}