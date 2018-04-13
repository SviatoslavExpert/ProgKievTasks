package lesson8;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class LevelOneExample {
    public static void main(String[] args){
        try (PrintWriter a = new PrintWriter("c.txt")){
            for(int i = 0; i < 10; i++){
                a.print(i);
            }
            a.println();

            a.println("Hello World!");
        } catch(FileNotFoundException e) {

        }
    }
}
