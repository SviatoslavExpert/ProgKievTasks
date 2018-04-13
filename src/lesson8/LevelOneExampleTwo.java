package lesson8;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LevelOneExampleTwo {

    public static void main(String[] args){
        String text = loadFromFile(new File("a.txt"));
        System.out.println(text);
    }


}
