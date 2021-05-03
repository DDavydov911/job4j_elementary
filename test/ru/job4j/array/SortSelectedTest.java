package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3Numbers() {
        int[] data = new int[] {5, 1, 22};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 5, 22};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort6Numbers() {
        int[] data = new int[] {15, 6, 22, 4, 18, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {4, 6, 7, 15, 18, 22};
        Assert.assertArrayEquals(expected, result);
    }
}