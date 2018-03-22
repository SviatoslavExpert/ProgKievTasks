/*
Написать код для зеркального переворота массива (7,2,9,4) -> (4,9,2,7). -
массив может быть произвольной длинны. (При выполнении задания
использовать дополнительный массив нельзя)
 */

package lesson5;

import java.util.Arrays;

public class LevelTwoTaskTwo {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println();

        rotateArray(arr);
    }

    private static void rotateArray(int[]a){
        for (int i = 0; i < a.length/2; i++) {
            int b = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - i - 1] = b;
        }
        System.out.println("Array after rotation: " + Arrays.toString(a));
    }
}
