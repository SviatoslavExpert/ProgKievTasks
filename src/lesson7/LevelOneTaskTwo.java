/*
Написать свой вариант метода Arrays.toString() для int[].
 */

package lesson7;

public class LevelOneTaskTwo {

    public static void main(String[] args){
        int[] arr = {5,2,7,9,25,57};
        System.out.print(convertArraysToString(arr));
    }

    private static String convertArraysToString(int[]array){
        String s = "";
        for(int i = 0; i < array.length; i++){
            s = s + array[i];
        }
        return s;
    }

}
