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

    private static void rotateArray(int[]arr){
        for (int i = 0; i < arr.length/2; i++) {
            int b = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - i - 1] = b;
        }
        System.out.println("Array after rotation: " + Arrays.toString(arr));
    }
}
