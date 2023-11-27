package org.examle.verify;


import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestArithmeticProgression {
    private SumCalculator arithmeticProgression;

    @BeforeEach
    void beforeEach() {
        arithmeticProgression = new SumCalculator();
    }

    @Test
    void verifyOneInSumCalculator() {
        int testNumberOne = 1;
        int correctAmount = arithmeticProgression.sum(testNumberOne);
        Assertions.assertEquals(testNumberOne, correctAmount);
    }

    @Test
    void verifyThreeInSumCalculator() {
        int testNumberThree = 3;
        int correctValue = 6;
        int correctAmount = arithmeticProgression.sum(testNumberThree);
        Assertions.assertEquals(correctValue, correctAmount);
    }

    @Test
    void verifyNullInSumCalculator() {
        int testException = 0;
        Assertions.assertThrows(IllegalArgumentException.class, () -> arithmeticProgression.sum(testException));
    }
}
