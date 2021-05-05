package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int middle, int right) {
        return left > right && left > middle ? left : middle > right ? middle : right;
    }

    public static int max(int first, int second, int third, int fourth) {
        return first > second && first > third && first > fourth ? first : second > third && second > fourth && second > first ? second : third > fourth ? third : fourth;
    }
}
