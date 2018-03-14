/*
Есть круг с центром в начале координат и радиусом 4. Пользователь
вводит с клавиатуры координаты точки x и y. Написать программу которая
определит лежит ли эта точка внутри круга или нет.
 */

package lessons3and4;

import java.util.Scanner;

public class LevelTwoTaskOne {

    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение координаты X точки:");
        double pointX = sc.nextDouble();
        System.out.println("Введите значение координаты Y точки:");
        double pointY = sc.nextDouble();

        double circleX = 0;
        double circleY = 0;
        double radius = 4;
        double result = Math.sqrt(Math.pow((pointX - circleX), 2) + Math.pow((pointY - circleY), 2));

        if (result < radius) {
            System.out.println("Точка лежит внутри круга.");
        }
        else if(result == radius) {
            System.out.println("Точка лежит на линии круга.");
        }
        else System.out.println("Точка лежит вне круга.");
        sc.close();
    }
}
