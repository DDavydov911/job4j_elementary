package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void whenBoundFive() {
        int bound = 5;
        int[] expected = new int[]{0, 1, 4, 9, 16};
        int[] result = Square.calculate(5);
        Assert.assertArrayEquals(expected, result);
    }
}