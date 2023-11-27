package org.example;

public class SumCalculator {

    public int sum(int n) {
        int arithmeticProgression = 0;

        if (n <= 0) {
            throw new IllegalArgumentException();
        }

        for (int i = 1; i <= n; i++) {
            arithmeticProgression += i;
        }
        return arithmeticProgression;
    }
}
