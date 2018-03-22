/*
Напишите метод который вернет количество слов в строке текста.
 */

package lesson5;

import java.util.Scanner;

public class LevelOneTaskFive {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = sc.nextLine();

        char[] arrayOfCharacters = s.toCharArray(); // created an array o characters

        int counter = 0;
        for(int i = 0; i < arrayOfCharacters.length; i++){
            if(arrayOfCharacters[i] == ' '){
                counter++;
            }
        }
        counter++;
        System.out.println("Количество слов в строке: " + counter);
    }
}
