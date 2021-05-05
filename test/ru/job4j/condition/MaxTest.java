package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenLeft5Right3Then5() {
        int left = 5;
        int right = 3;
        int expected = 5;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenLeft1Right2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenLeft1Right1Then1() {
        int left = 1;
        int right = 1;
        int expected = 1;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenLeft5Middle4Right3Then5() {
        int left = 5;
        int middle = 4;
        int right = 3;
        int expected = 5;
        int result = Max.max(left, middle, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFirst2Second7Third4Furth9Then9() {
        int first = 2;
        int second = 7;
        int third = 4;
        int furth = 9;
        int expected = 9;
        int result = Max.max(first, second, third, furth);
        Assert.assertEquals(expected, result);
    }
}