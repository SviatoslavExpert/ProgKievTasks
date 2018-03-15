/*
Выведите на экран прямоугольник из *. Причем высота и ширина
прямоугольника вводятся с клавиатуры. Например ниже представлен
прямоугольник с высотой 4 и шириной 5.
*****
*   *
*   *
*****
 */

package lesson4;

import java.util.Scanner;

public class LevelOneTaskFour {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height:");
        int height = sc.nextInt();
        System.out.println("Enter width:");
        int width = sc.nextInt();

        for(int i = 1; i <= height; i++){
            if(i == 1){
                for(int j = 0; j < width; j++){
                    System.out.print("*");
                }
            }
            else if(i != height){
                System.out.println();
                System.out.print("*");
                for(int j = 0; j < (width - 2); j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            else{
                System.out.println();
                for(int j = 0; j < width; j++){
                    System.out.print("*");
                }
            }
        }
    }
}
