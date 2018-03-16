/*
Есть девятиэтажный дом, в котором 4 подъезда. Номер подъезда
начинается с единицы. На одном этаже 4 квартиры. Напишите программу
которая получит номер квартиры с клавиатуры, и выведет на экран на
каком этаже, какого подъезда расположенна эта квартира. Если такой
квартиры нет в этом доме то нужно сообщить об этом пользователю.
 */

package lesson3;

import java.util.Scanner;

public class LevelOneTaskTwo {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter flat number (1 - 144):");
        int flatNumber = sc.nextInt();

        if(flatNumber > 0 && flatNumber <= 144) {
            int entrance = ((int) ((flatNumber - 1) / 36)) + 1;
            int floor = (int) (((flatNumber - 1) % 36) / 4 + 1);

            System.out.println("Entrance is: " + entrance);
            System.out.println("Floor is: " + floor);
        }else{
            System.out.print("Квартиры с таким номером в этом доме нет.");
        }
    }
}
