/*
С помощью циклов нарисовать «обои». Причем количество полос
должно вводиться с клавиатуры. В примере 7 полос.
***+++***+++***+++***
***+++***+++***+++***
***+++***+++***+++***
***+++***+++***+++***
***+++***+++***+++***
 */

package lesson4;

import java.util.Scanner;

public class LevelOneTaskOne {

    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество полос:");
        int rows = sc.nextInt();
        System.out.println("Введите длину полос:");
        int height = sc.nextInt();

        for (int i = 0; i < height; i++){
            for (int j = 0; j < rows; j++){
                if(j%2 ==0){
                    System.out.print("***");
                }
                else {
                    System.out.print("+++");
                }
            }
            System.out.println();
        }
    }

}
