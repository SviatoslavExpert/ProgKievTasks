/*
Вычислить с помощью цикла факториал числа - n введенного с
клавиатуры (4<n<16). Факториал числа это произведение всех чисел от
этого числа до 1. Например 5!=5*4*3*2*1=120
 */

package lesson4;

import java.util.Scanner;

public class LevelOneTaskTwo {

    public static void main (String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 4-х до 16:");
        double number = sc.nextDouble();

        double x = 1;
        if(number > 4 && number < 16) {
            for (int i = 1; i <= number; i++) {
                x *= i;
            }
            System.out.println("Факториал числа " + number + ": " + x);
        }
        else System.out.println("Неверное число.");
        sc.close();
    }
}
