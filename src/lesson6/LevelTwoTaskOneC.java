/*
Существуют такие последовательности чисел
0,2,4,6,8,10,12
1,4,7,10,13
1,2,4,8,16,32
1,3,9,27
1,4,9,16,25
1,8,27,64,125
Реализуйте программу которая выведет следующий член этой
последовательности (либо подобной им). Например пользователь вводит
строку 0,2,4,6,8,10,12 ответом программы должно быть число 14.
 */
package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class LevelTwoTaskOneC {
    public static void main(String[] args) {
        checkSequence(scanNumbers());
    }

    private static int[] scanNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Необходимо ввести не менее 4-х чисел.");
        System.out.println("Укажите, сколько чисел вы собираетесь ввести: ");
        int numbers = sc.nextInt();
        int[] arr = new int[numbers];

        int num = 0;
        for (int i = 0; i < numbers; i++) {
            System.out.println("Введите число №" + (i + 1));
            num = sc.nextInt();
            arr[i] = num;
        }
        System.out.println("Числа, которые вы ввели: " + Arrays.toString(arr));
        return arr;
    }

    private static void checkSequence(int[] arr) {
        int countOne = 0;
        int countTwo = 0;
        int countThree = 0;
        int countFour = 0;
        int countFive = 0;
        int countSix = 0;
        for(int i = 0; i < (arr.length - 1); i++){
            if(arr[i] + 2 == arr[i + 1]){
                ++countOne;
            }
            if(arr[i] + 3 == arr[i + 1]){
                ++countTwo;
            }
            if(arr[i] * 2 == arr[i + 1]){
                ++countThree;
            }
            if(arr[i] * 3 == arr[i + 1]){
                ++countFour;
            }
            if(arr[i] == Math.pow(i + 1, 2)){
                ++countFive;
            }
            if(arr[i] == Math.pow(i + 1, 3)){
                ++countSix;
            }
        }
        int[] counts = {countOne, countTwo, countThree, countFour, countFive, countSix};
        System.out.println("Массив counts: " + Arrays.toString(counts));

        getNumber(counts, arr);
    }

    private static void getNumber(int[] counts, int[]arr){
        String s = "Следующее число в этой последовательности: ";
        if(counts[0] == arr.length - 1){
            System.out.println(s + (arr[arr.length - 1] + 2));
        }
        if(counts[1] == arr.length - 1){
            System.out.println(s + (arr[arr.length - 1] + 3));
        }
        if(counts[2] == arr.length - 1){
            System.out.println(s + (arr[arr.length - 1] * 2));
        }
        if(counts[3] == arr.length - 1){
            System.out.println(s + (arr[arr.length - 1] * 3));
        }
        if(counts[4] == arr.length - 1){
            System.out.println(s + (int)(Math.pow(arr.length + 1, 2)));
        }
        if(counts[5] == arr.length - 1){
            System.out.println(s + (int)(Math.pow(arr.length + 1, 3)));
        }
    }
}
