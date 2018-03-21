/*
Создать массив случайных чисел (размером 15 элементов). Создайте
второй массив в два раза больше, первые 15 элементов должны быть
равны элементам первого массива, а остальные элементы заполнить
удвоенных значением начальных. Например
Было → {1,4,7,2}
Стало → {1,4,7,2,2,8,14,4}
 */
package lesson5;

import java.util.*;

public class LevelOneTaskThree {

    public static void main(String[] args) {

        int n = 15;
        int[] arrayOne = new int[n];
        int[] arrayTwo = new int[n * 2];

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = (int) (Math.random() * 100 + 1);
        }
        for (int i = 0; i < arrayTwo.length; i++) {
            if (i < n) {
                arrayTwo[i] = arrayOne[i];
            } else if (i < n * 2) {
                arrayTwo[i] = arrayOne[i - n] * 2;
            }
        }
        System.out.println("Первый массив: " + Arrays.toString(arrayOne));
        System.out.println("Второй массив: " + Arrays.toString(arrayTwo));
    }
}
