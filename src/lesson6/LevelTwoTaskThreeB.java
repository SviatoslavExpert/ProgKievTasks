/*
Существует массив {1,2,3,4,5}. Напишите программу которая выведет на
экран все возможные комбинации из этих цифр. Внимание повторений
быть не должно.
 */

package lesson6;

import java.util.Arrays;

public class LevelTwoTaskThreeB {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println();

        System.out.println("Array combinations:");
        makeCombinations(arr,arr.length);
    }

    private static void makeCombinations(int[] arr, int size) {
        if (size < 2){
            System.out.println(Arrays.toString(arr));
        }else{
            for (int k = 0; k <size ; k++) {
                swap(arr, k,size - 1);
                makeCombinations(arr,size - 1);
                swap(arr,size - 1, k);
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int b = arr[j];
        arr[j] = arr[i];
        arr[i] = b;
    }
}
