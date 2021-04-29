package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2.0;
        double bc = 2.0;
        double ac = 2.0;
        boolean result = Triangle.exist(ab, bc, ac);
        Assert.assertTrue(result);
    }

    @Test
    public void notExist() {
        double ab = 1.0;
        double bc = 0.1;
        double ac = 0.2;
        boolean result = Triangle.exist(ab, bc, ac);
        Assert.assertFalse("Все-таки, он существует", result);
    }
}