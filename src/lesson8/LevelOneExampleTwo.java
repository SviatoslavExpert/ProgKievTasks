/*
Reading info from file with Scanner
 */

package lesson8;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LevelOneExampleTwo {

    public static void main(String[] args){
        String text = loadFromFile(new File("c.txt"));
        System.out.println(text);
    }

    public static String loadFromFile(File file){
        StringBuilder sb = new StringBuilder();

        try(Scanner sc = new Scanner(file)){
            for(;sc.hasNextLine();){
                sb.append(sc.nextLine()).append(System.lineSeparator());
            }
        } catch(IOException e){
            System.out.println(e);
        }
        return sb.toString();
    }
}
