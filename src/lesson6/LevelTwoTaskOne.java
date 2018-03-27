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
    public static void main(String[] args){
        getPattern(scanNumbers());
    }

    private static int[] scanNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Необходимо ввести не менее 4-х чисел. Укажите, сколько чисел вы собираетесь ввести: ");
        int numbers = sc.nextInt();

        if(numbers >= 4) {
            int[] arr = new int[numbers];

            int num = 0;
            for (int i = 0; i < numbers; i++) {
                System.out.println("Введите число № " + i);
                num = sc.nextInt();
                arr[i] = num;
            }
            return arr;
        } else {
            System.out.println("Вы ввели недостаточное количество чисел.");
        }

    }

    private static int getPattern(int[] arr){

    }
}
