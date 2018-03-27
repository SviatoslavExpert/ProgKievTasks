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

public class LevelTwoTaskOneB {
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
            if(Math.pow(arr[i], 2) == arr[i + 1]){
                ++countFive;
            }
            if(Math.pow(arr[i], 3) == arr[i + 1]){
                ++countSix;
            }
        }
        int[] counts = {countOne, countTwo, countThree, countFour, countFive, countSix};
        System.out.println("Массив counts: " + Arrays.toString(counts));

        printNumber(counts, arr);
    }

    private static void printNumber(int[] counts, int[]arr){
        if(counts[0] >= 3 ){
            System.out.println("Следующее число в этой последовательности: " + (arr[arr.length - 1] + 2));
        }
        if(counts[1] >= 3 ){
            System.out.println("Следующее число в этой последовательности: " + (arr[arr.length - 1] + 3));
        }
        if(counts[2] >= 3 ){
            System.out.println("Следующее число в этой последовательности: " + (arr[arr.length - 1] * 2));
        }
        if(counts[3] >= 3 ){
            System.out.println("Следующее число в этой последовательности: " + (arr[arr.length - 1] * 3));
        }
        if(counts[4] >= 3 ){
            System.out.println("Следующее число в этой последовательности: " + (Math.pow(arr[arr.length - 1], 2)));
        }
        if(counts[5] >= 3 ){
            System.out.println("Следующее число в этой последовательности: " + (Math.pow(arr[arr.length - 1], 3)));
        }
    }
}

/*
        if (arr[0] + 2 == arr[1] && arr[1] + 2 == arr[2] && arr[2] + 2 == arr[3]) {
            System.out.println("Следующее число в этой последовательности: " + (arr[arr.length - 1] + 2));
        } else if (arr[0] + 3 == arr[1] && arr[1] + 3 == arr[2] && arr[2] + 3 == arr[3]) {
            System.out.println("Следующее число в этой последовательности: " + (arr[arr.length - 1] + 3));
        } else if (arr[0] * 2 == arr[1] && arr[1] * 2 == arr[2] && arr[2] * 2 == arr[3]) {
            System.out.println("Следующее число в этой последовательности: " + (arr[arr.length - 1] * 2));
        } else if (arr[0] * 3 == arr[1] && arr[1] * 3 == arr[2] && arr[2] * 3 == arr[3]) {
            System.out.println("Следующее число в этой последовательности: " + (arr[arr.length - 1] * 3));
        } else if ((Math.pow(arr[0], 2) == 1) && (Math.pow(arr[1], 2) == 4) && (Math.pow(arr[2], 2) == 9)) {
            System.out.println("Следующее число в этой последовательности: " + (Math.pow(arr[arr.length - 1], 2)));
        } else if ((Math.pow(arr[0], 3) == 1) && (Math.pow(arr[1], 3) == 8) && (Math.pow(arr[2], 3) == 27)) {
            System.out.println("Следующее число в этой последовательности: " + (Math.pow(arr[arr.length - 1], 3)));
        }else{
            System.out.println("Неизвестная последовательность чисел.");
        }
 */
