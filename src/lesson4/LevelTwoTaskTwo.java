/*
С помощью циклов вывести на экран все простые числа от 1 до 100.
Простое число — число которое делиться нацело только на единицу или
само на себя. Первые простые числа это — 2,3,5,7…
*/

package lesson4;

public class LevelTwoTaskTwo {

    public static void main(String[] args) {
        int count;
        for (int i = 1; i < 100; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if ((i % j) == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
