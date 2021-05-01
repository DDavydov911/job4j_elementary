package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        if (n == 0) {
            return 1;
        }
        for (int i = 1; i <= n; i++) {
             result *= i;
        }
        return  result;
    }
}
