/*
«Перевернуть массив». Т.е. написать программу которая повернет
базовый массив на 90,180,270 градусов по часовой стрелке. (При
выполнении задания использовать дополнительный массив нельзя). В
примере показан поворот на 90 градусов - (3 часа)
Было:
[1, 2, 3, 4, 5, 6]
[1, 2, 3, 4, 5, 6]
[1, 2, 3, 4, 5, 6]
[1, 2, 3, 4, 5, 6]
[1, 2, 3, 4, 5, 6]
[1, 2, 3, 4, 5, 6]
Стало:
[1, 1, 1, 1, 1, 1]
[2, 2, 2, 2, 2, 2]
[3, 3, 3, 3, 3, 3]
[4, 4, 4, 4, 4, 4]
[5, 5, 5, 5, 5, 5]
[6, 6, 6, 6, 6, 6]
 */
package lesson5;

public class LevelTwoTaskOne {

    public static void main (String[] args){
        /* Original array created and filled */
        int[][] a = {
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
        };
        /* Original array printed */
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        rotateArray(a); /* Rotates 90*   */
        System.out.println();
        rotateArray(a); /* Rotates 180*  */
        System.out.println();
        rotateArray(a); /* Rotates 270*  */
    }

    private static void rotateArray(int[][] a){
        //  Rotating the array
        for (int i = 0; i < a.length/2; i++) {
            for (int j = i; j < a.length - 1 - i; j++) {
                int b = a[i][j];
                a[i][j] = a[a.length - j - 1][i];
                a[a.length - j - 1][i] = a[a.length - i - 1][a.length - j - 1];
                a[a.length - i - 1][a.length - j - 1] = a[j][a.length - i - 1];
                a[j][a.length - i - 1] = b;
            }
        }
        //  Printing the rotated array
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
