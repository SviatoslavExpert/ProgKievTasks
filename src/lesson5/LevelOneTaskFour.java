/*
Введите строку текста с клавиатуры — реализуйте программу для
возможности подсчета количества символа — 'b' в этой строке, с выводом
результат на экран.
 */
package lesson5;

import java.util.Scanner;

public class LevelOneTaskFour {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = sc.nextLine();

        char[] arrayOfCharacters = s.toCharArray(); // created an array of characters

        int counter = 0;
        for(int i = 0; i < arrayOfCharacters.length; i++){
            if(arrayOfCharacters[i] == 'b'){
                counter++;
            }
        }
        System.out.println("Количество символа b в строке: " + counter);
    }
}
