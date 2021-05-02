package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void
    whenSumEvenNumbersFrom5To12Then36() {
        int start = 5;
        int finish = 12;
        int result = Counter.sumByEven(5, 12);
        int expected = 36;
        Assert.assertEquals(expected, result);
    }
}