package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out,  0.01);
    }

    @Test
    public void when50to55then5() {
        int expected = 5;
        Point point1 = new Point(5, 0);
        Point point2 = new Point(5, 5);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out,  0.01);
    }

    @Test
    public void when00to55then2() {
        double expected = 7.07;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(5, 5);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out,  0.01);
    }

    @Test
    public void when000to500then5() {
        double expected = 5.0;
        Point point1 = new Point(0, 0, 0);
        Point point2 = new Point(5, 0, 0);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out,  0.01);
    }

    @Test
    public void when000to333then5() {
        double expected = 5.196;
        Point point1 = new Point(0, 0, 0);
        Point point2 = new Point(3, 3, 3);
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out,  0.01);
    }
}