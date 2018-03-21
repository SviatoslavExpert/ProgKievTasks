/*
Реализуйте метод рисующий на экране прямоугольник из звездочек «*»
— его параметрами будут целые числа которые описывают длину и
ширину такого прямоугольника.
 */

package lesson6;

public class LevelOneTaskThree {

    public static void main(String[] args){
        drawRectangular(5,7);
    }

    private static void drawRectangular(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
             System.out.println();
        }
    }
}
