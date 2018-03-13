package lessons3and4;

import java.util.Scanner;

public class TaskThree {
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
