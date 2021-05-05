package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        if (left.length == 0) {
            return right;
        }
        if (right.length == 0) {
            return left;
        }
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (leftIndex != left.length && rightIndex != right.length) {
                if (left[leftIndex] > right[rightIndex]) {
                    rsl[i] = right[rightIndex];
                    rightIndex++;
                } else {
                    rsl[i] = left[leftIndex];
                    leftIndex++;
                }
            } else if (leftIndex == 0) {
                rsl[i] = left[leftIndex];
                leftIndex++;
            } else {
                rsl[i] = right[rightIndex];
                rightIndex++;
            }
        }
        return rsl;
    }
}
