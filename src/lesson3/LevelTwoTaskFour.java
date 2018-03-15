/*
С клавиатуры вводиться шестизначное число. Проверить, является ли
оно палиндромом. Примечание: палиндромом называется число, слово
или текст, которые одинакового читаются слева направо и справа налево.
Например, это числа 143341, 5555, 7117 и т. д.
 */

package lesson3;

import java.util.Scanner;

public class LevelTwoTaskFour {

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 6-digit number:");
        int num = sc.nextInt();

        int numA = num / 100000;
        int numB = num % 100000 / 10000;
        int numC = num % 10000 / 1000;
        int numD = num % 1000 / 100;
        int numE = num % 100 / 10;
        int numF = num % 10;
        sc.close();

        if(numA == numF && numB == numE && numC == numD){
            System.out.println("This number is a palindrome.");
        }else{
            System.out.println("This number is not a palindrome.");
        }
    }
}
