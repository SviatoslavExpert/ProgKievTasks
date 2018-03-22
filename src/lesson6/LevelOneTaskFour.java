/*
Напишите метод который реализует линейный поиск элемента в массиве
целых чисел. Если такой элемент в массиве есть то верните его индекс,
если нет то метод должен возвращать число - «-1»
 */

package lesson6;

import java.util.Scanner;

public class LevelOneTaskFour {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,145, 557, 345, 654, 999};
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите елемент массива, индекс которого вы хотите найти: ");
        int a = sc.nextInt();

        System.out.println(searchElement(a,arr));
    }

    private static int searchElement(int a, int[] arr){
        int result = -10000;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == a){
                result = i;
            }
        }
        if(result == -10000){
            result = -1;
        }
        return result;
    }
}
