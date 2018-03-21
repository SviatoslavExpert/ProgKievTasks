/*
Дан массив {0,5,2,4,7,1,3,19} — написать программу для подсчета
нечетных цифр в нем.
 */

package lesson5;

public class LevelOneTaskOne {

    public static void main(String[] args){

        int [] array = {0,5,2,4,7,1,3,19};

        int counter = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i]%2 != 0){
                counter++;
            }
        }
        System.out.println("Количество нечетных цифр в массиве: " + counter);
    }
}
