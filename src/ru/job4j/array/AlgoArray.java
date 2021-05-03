package ru.job4j.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0]; /* переменная для временного хранения значение ячейки с индексом 0. */
        array[0] = array[3]; /* записываем в ячейку с индексом 0 значение ячейки с индексом 3. */
        array[3] = temp; /* записываем в ячейку с индексом 3 значение временной переменной. */
        temp = array[1];
        array[1] = array[2];
        array[2] = temp;
        temp = array[3];
        array[3] = array[4];
        array[4] = temp;
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
//    public static void main(String[] args) {
//        int[] array = new int[]{5, 3, 2, 1, 4, 10, 7, 9, 8, 15, 14, 12, 11, 13};
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length - 1; j++) {
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j + 1];
//                    array[j + 1] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(array));
//    }
}
