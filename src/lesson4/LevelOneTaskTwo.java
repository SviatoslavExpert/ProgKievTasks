/*
Напечатайте таблицу умножения на 5. предпочтительно печатать 1 x 5 =
5, 2 x 5 = 10, а не просто 5, 10 и т. д.
 */

package lesson4;

public class LevelOneTaskTwo {

    public static void main (String []args){
        int num = 10;
        for (int i = 1; i < num; i++){
            System.out.println(i + " x " + 5 + " = " + i*5);
        }
    }
}
