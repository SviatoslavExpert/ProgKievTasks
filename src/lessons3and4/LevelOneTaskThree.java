/*
Определить количество дней в году, который вводит пользователь. В
високосном годе - 366 дней, тогда как в обычном 365. Високосный год
определяется по следующему правилу:
Год високосный, если он делится на четыре без остатка, но если он
делится на 100 без остатка, это не високосный год. Однако, если он
делится без остатка на 400, это високосный год.
 */

package lessons3and4;

import java.util.Scanner;

public class LevelOneTaskThree {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Год высокосный. Количество дней в году: 366");
        } else {
            System.out.println("Год невысокосный. Количество дней в году: 365");
        }
    }
}
