/*
Выведите на экран 10 строк со значением числа Пи. Причем в первой
строке должно быть 2 знака после запятой, во второй 3, в третьей 4 и т.д.
 */

package lesson7;

import java.util.Formatter;

public class LevelOneTaskFour {

    public static void main(String[] args){

        int number = 10;
        for(int i = 2; i < (number + 2); i++) {
            Formatter fr = new Formatter();
            fr.format("%." + i + "f", Math.PI);

            System.out.println(fr.toString());
        }
    }
}
