/*
Число-палиндром с обеих сторон (справа налево и слева направо)
читается одинаково. Самое большое число-палиндром, полученное
умножением двух двузначных чисел – 9009 = 91 × 99.
Найдите самый большой палиндром, полученный умножением двух
трехзначных чисел.
 */
package lesson6;

public class LevelTwoTaskTwo2 {

    public static void main(String[] args) {

        System.out.println(createArray());
        getPalindromes(arr);
    }

    private static int[] createArray(){
        /* Создаем массив и заполняем его числами, размер массива: 999 * 999 */
        int[] arr = new int[999 * 999]; //в этом массиве будут все палиндромы (пустой массив для заполнения)

        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
        return arr;
    }
    private static int getPalindromes(int[] arr){

    }
}
