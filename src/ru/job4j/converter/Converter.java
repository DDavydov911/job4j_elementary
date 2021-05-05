package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int expected = 2;
        boolean passedE = euro == expected;
        System.out.println("140 rubles are 2 euro. Test result: " + passedE);
        int dollar = Converter.rubleToDollar(120);
        boolean passedD = dollar == expected;
        System.out.println("120 rubles are 2 dollars. Test result: " + passedD);
    }
}
