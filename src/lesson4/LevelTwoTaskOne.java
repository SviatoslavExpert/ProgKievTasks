/*
С помощью цикла (только одного) нарисовать такую фигуру. Причем
максимальная высота этой фигуры вводиться с клавиатуры (в примере
максимальная высота - 4)
*
**
***
****
***
**
*
 */
package lesson4;

import java.util.Scanner;

public class LevelTwoTaskOne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите максимальную высоту: ");
        int num = sc.nextInt()*2;

        int j = 0;
        for(int i = 0; i < (num - 1);){
            if(j >= (num/2) - Math.abs(num/2 - i)){
                System.out.println();
                i++;
                j = 0;
            }
            System.out.print("*");
            j++;
        }
        sc.close();
    }
}
