/*
Написать программу которая вычислит и выведет на экран
площадь треугольника если известны его стороны.
 */

package com.gmail.s.granovskiy;

import java.util.Scanner;

public class TaskThree {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение радиуса:");
        double radius = sc.nextDouble();
        System.out.println("Длина окружности = " + 2 * Math.PI * radius);
        sc.close();
    }
}
