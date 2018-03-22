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
        int element = sc.nextInt();

        System.out.println(searchElemIndex(element,arr));
    }

    private static int searchElemIndex(int element, int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }
}
