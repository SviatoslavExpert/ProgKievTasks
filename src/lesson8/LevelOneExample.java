/*
Info will be recorded in the file c.txt with class PrintWriter;
 */

package lesson8;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class LevelOneExample {

    public static void main(String[] args){

        /*   object file is created;  object PrintWriter is created; */
        /*    name of the file as a destination for PrintWriter  */
        try (PrintWriter a = new PrintWriter("c.txt")){
            for(int i = 0; i < 10; i++){
                a.print(i);
            }
            a.println();

            a.println("Hello World!");
        } catch(FileNotFoundException e) {
            System.out.println("ERROR FILE WRITE");
        }
        /* recording of info is inside try catch block */
    }
}
