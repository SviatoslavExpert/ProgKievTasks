/*
Напишите метод который вернет количество слов в строке текста.
 */

package lesson6;

import java.util.Scanner;

public class LevelOneTaskFiveB {
    public static void main(String[] args){
        System.out.println("Количество слов в строке: " + countWords(scanLine()));
    }

    private static String scanLine(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = sc.nextLine();
        return s;
    }

    private static int countWords(String s) {
        char[] arrayOfCharacters = s.toCharArray(); // created an array of characters
        int counter = 0;
        for (int i = 0; i < arrayOfCharacters.length; i++) {
            if (arrayOfCharacters[i] == ' ') {
                counter++;
            }
        }
        return ++counter;
    }
}
