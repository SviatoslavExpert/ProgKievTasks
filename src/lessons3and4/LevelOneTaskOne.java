/*
Написать программу которая считает 4 числа c клавиатуры и выведет на
экран самое большое из них.
 */

package lessons3and4;

import java.util.Scanner;

public class LevelOneTaskOne {

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = sc.nextInt();
        System.out.println("Введите второе число:");
        int b = sc.nextInt();
        System.out.println("Введите третье число:");
        int c = sc.nextInt();
        System.out.println("Введите четвертое число:");
        int d = sc.nextInt();

        System.out.println(select(select(a,b), select(c,d)));
    }

    private static int select(int x, int y){
        if (x > y) return x;
        else return y;
    }
}
