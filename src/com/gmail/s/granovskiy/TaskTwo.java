/*
Написать программу которая вычислит и выведет на экран
площадь треугольника если известны его стороны.
 */

package com.gmail.s.granovskiy;

public class TaskTwo {
    public static void main (String []args){
        double a = 0.3;
        double b = 0.4;
        double c = 0.5;
        double p = (a + b + c)/2.0;  //   очень важно: деление на вещественное число
        System.out.println("Площадь треугольника: " + Math.sqrt(p*(p - a)*(p - b)*(p - c)));
    }
}
