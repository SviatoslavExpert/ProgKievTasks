/*
Число-палиндром с обеих сторон (справа налево и слева направо)
читается одинаково. Самое большое число-палиндром, полученное
умножением двух двузначных чисел – 9009 = 91 × 99.
Найдите самый большой палиндром, полученный умножением двух
трехзначных чисел.
 */
package lesson6;

import java.util.ArrayList;
import java.util.Arrays;

public class LevelTwoTaskTwo3 {

    public static void main(String[] args) {
        /* Создаем массив и заполняем его числами, размер массива: 999 * 999 */
        int[] arr = new int[999 * 999]; //в этом массиве будут все палиндромы (пустой массив для заполнения)

        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
        getPalindromes(arr);
    }

    public static void getPalindromes(int[] arr){
        int partOne;
        int partTwo;
        int partThree;
        int partFour;
        int partFive;
        int partSix;
        ArrayList arrayOfPalindromes = new ArrayList();
        for(int i = 0; i < arr.length; i++){
            if(Integer.toString(arr[i]).length() == 6){
                partOne = arr[i] / 100000;
                partTwo = arr[i] % 100000 / 10000;
                partThree = arr[i] % 10000 / 1000;
                partFour = arr[i] % 1000 / 100;
                partFive = arr[i] % 100 / 10;
                partSix = arr[i] % 10;
                if(partOne == partSix && partTwo == partFive && partThree == partFour){
                    arrayOfPalindromes.add(arr[i]);
                }
            }
        }
        System.out.print(Arrays.toString(arrayOfPalindromes.toArray()));
    }
}
