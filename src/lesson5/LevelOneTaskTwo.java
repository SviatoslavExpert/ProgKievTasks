/*
Написать код для возможности создания массива целых чисел (размер
вводиться с клавиатуры) и возможности заполнения каждого его элемента
вручную. Выведите этот массив на экран.
 */

package lesson5;

import java.util.*;

public class LevelOneTaskTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов (размер) массива.");
        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите элемент масива с индексом " + i + ":" + " ");
            array[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Массив заполнен: " + Arrays.toString(array));
    }
}
