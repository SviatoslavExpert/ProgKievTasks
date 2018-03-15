/*
Проверить, является ли четырехзначное число счастливым билетом.
Дано четырехзначное число. Проверить, является ли оно «счастливым
билетом». Примечание: счастливым билетом называется число, в
котором - при четном количестве цифр в числе сумма цифр его левой
половины равна сумме цифр его правой половины. Например,
рассмотрим число 1322. Его левая половина равна 13, а правая – 22, и
оно является счастливым билетом (т. к. 1 + 3 = 2 + 2)
 */

package lesson3;

import java.util.Scanner;

public class LevelTwoTaskThree {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4-digit number:");
        int num = sc.nextInt();

        int a = num / 1000;
        int b = num % 1000 / 100;
        int c = num % 100 / 10;
        int d = num % 10;
        sc.close();

        if(a + b == c + d){
            System.out.print("Your ticket is lucky.");
        }else {
            System.out.print("Try one more time.");
        }
    }
}
