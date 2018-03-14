/*
Дан треугольник координаты вершин А(0,0), В(4,4), С(6,1). Пользователь
вводит с клавиатуры координаты точки x и y. Написать программу которая
определит лежит ли эта точка внутри треугольника или нет.
 */

package lesson3;

import java.util.Scanner;

public class LevelTwoTaskTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите координату Х");
        double x = sc.nextDouble();
        System.out.print("Введите координату Y");
        double y = sc.nextDouble();

        double ax = 0;
        double ay = 0;
        double bx = 4;
        double by = 4;
        double cx = 6;
        double cy = 1;

        double k1 = (ax - x) * (by - ay) - (bx - ax) * (ay - y);
        double k2 = (bx - x) * (cy - by) - (cx - bx) * (by - y);
        double k3 = (cx - x) * (ay - cy) - (ax - cx) * (cy - y);

        if(k1 > 0 && k2 > 0 && k3 > 0 || k1 < 0 && k2 < 0 && k3 < 0){
            System.out.println("Точка лежит в треугольнике.");
        }
        else if(k1 == 0 && k2 == 0 && k3 == 0){
            System.out.println("Точка лежит на стороне треугольника.");
        }
        else{
            System.out.println("Точка не лежит в треугольнике.");
        }
        sc.close();
    }
}
