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

import java.util.Scanner;

public class LevelTwoTaskOne {
    public static void main(String[] args) {
        sortAndPrint(scanNumbers());
    }

    private static int[] scanNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Необходимо ввести не менее 4-х чисел. Укажите, сколько чисел вы собираетесь ввести: ");
        int numbers = sc.nextInt();

        int[] arr = new int[numbers];

        int num = 0;
        for (int i = 0; i < numbers; i++) {
            System.out.println("Введите число №" + (i + 1));
            num = sc.nextInt();
            arr[i] = num;
        }
        return arr;
    }

    private static void sortAndPrint(int[] arr) {
        if (arr[0] + 2 == arr[1] && arr[1] + 2 == arr[2] && arr[2] + 2 == arr[3]) {
            System.out.println("Следующее число в этой последовательности: " + (arr[arr.length - 1] + 2));
        } else if (arr[0] + 3 == arr[1] && arr[1] + 3 == arr[2] && arr[2] + 3 == arr[3]) {
            System.out.println("Следующее число в этой последовательности: " + (arr[arr.length - 1] + 3));
        } else if (arr[0] * 2 == arr[1] && arr[1] * 2 == arr[2] && arr[2] * 2 == arr[3]) {
            System.out.println("Следующее число в этой последовательности: " + (arr[arr.length - 1] * 2));
        } else if (arr[0] * 3 == arr[1] && arr[1] * 3 == arr[2] && arr[2] * 3 == arr[3]) {
            System.out.println("Следующее число в этой последовательности: " + (arr[arr.length - 1] * 2));
        } else if ((Math.pow(arr[0], 2) == 1) && (Math.pow(arr[1], 2) == 4) && (Math.pow(arr[2], 2) == 9)) {
            System.out.println("Следующее число в этой последовательности: " + (Math.pow(arr[arr.length - 1], 2)));
        } else if ((Math.pow(arr[0], 3) == 1) && (Math.pow(arr[1], 3) == 8) && (Math.pow(arr[2], 3) == 27)) {
            System.out.println("Следующее число в этой последовательности: " + (Math.pow(arr[arr.length - 1], 3)));
        }else{
            System.out.println("Неизвестная последовательность чисел.");
        }
    }
}
