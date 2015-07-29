/*
Реализуйте метод параметрами которого являются - целое число,
вещественное число и строка. Возвращает он конкатенацию строки с
суммой вещественного и целого числа.
 */

package lesson6;

public class LevelOneTaskTwo {
    public static void main(String[] args){

        System.out.println(returnConcatenation(5, 3.71, "word"));
    }

    private static String returnConcatenation(int a, double b, String s){

        return s + (String.valueOf(a + b));
    }
}
