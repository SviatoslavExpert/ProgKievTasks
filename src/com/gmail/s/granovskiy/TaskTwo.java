package com.gmail.s.granovskiy;

public class TaskTwo {
    public static void main (String []args){
        double a = 0.3;
        double b = 0.4;
        double c = 0.5;
        double p = (a + b + c)/2.0;
        System.out.println("Площадь треугольника: " + Math.sqrt(p*(p - a)*(p - b)*(p - c)));
    }
}
