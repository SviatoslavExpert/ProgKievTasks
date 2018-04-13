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

public class LevelTwoTaskOneE {
    public static void main(String[] args) {

        processSequence(scanNumbers());
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

    private static void processSequence(int[] arr) {
        int countOne = 0;
        int countTwo = 0;
        int countThree = 0;
        int countFour = 0;
        int countFive = 0;
        int countSix = 0;
        int n = arr[1] - arr[0];
        int k = arr[2]/arr[1];
        for(int i = 0; i < (arr.length - 1); i++){
            if(arr[i] + n == arr[i + 1]){
                ++countOne;
            }
            /*
            if(arr[i] + (arr[i + 1] - arr[i]) == arr[i + 1]){
                ++countTwo;
            }
            */
            if(arr[i] * k == arr[i + 1]){
                ++countTwo;
            }
            /*
            if(arr[i] * 3 == arr[i + 1]){
                ++countFour;
            }
            */
            /*
            if(arr[i] == Math.pow(i + 1, 2)){
                ++countThree;
            }
            */
            /*
            if(arr[i] == Math.pow(i + 1, 3)){
                ++countSix;
            }
            */
        }
        int[] counts = {countOne, countTwo};
        System.out.println("Массив counts: " + Arrays.toString(counts));

        getResult(counts, arr, n, k);
    }

    private static void getResult(int[] counts, int[]arr, int n, int k){
        String s = "Следующее число в этой последовательности: ";
        if(counts[0] == arr.length - 1){
            System.out.println(s + (arr[arr.length - 1] + n));
        }
        /*
        if(counts[1] == arr.length - 1){
            System.out.println(s + (arr[arr.length - 1] + 3));
        }
        */
        if(counts[1] == arr.length - 1){
            System.out.println(s + (arr[arr.length - 1] * k));
        }
        /*
        if(counts[3] == arr.length - 1){
            System.out.println(s + (arr[arr.length - 1] * 3));
        }
        */
        /*
        if(counts[2] == arr.length - 1){
            System.out.println(s + (int)(Math.pow(arr.length + 1, )));
        }
        */
        /*
        if(counts[5] == arr.length - 1){
            System.out.println(s + (int)(Math.pow(arr.length + 1, 3)));
        }
        */
        if((counts[0] != arr.length - 1) && (counts[1] != arr.length - 1) && (counts[2] != arr.length - 1)){
            System.out.println("Такой последовательности в программе нет.");
        }
    }
}
