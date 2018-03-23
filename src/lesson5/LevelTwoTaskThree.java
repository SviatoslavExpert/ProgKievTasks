/*
Ввести с клавиатуры число (до миллиарда) которое обозначает
количество долларов и центов пользователя. Вывести это количество
прописью. (4 часа)
Например:
How much money do you have?
123,34
You have: one hundred twenty three dollars thirty four cents
 */

package lesson5;

import java.util.Scanner;

public class LevelTwoTaskThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] val = { "million", "thousand", "", "hundred" };
        String[] chislo = { "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen", "twenty" };
        String[] des = { "twenty", "thirty", "forty", "fifty", "sixty",
                "seventy", "eighty", "ninety" };
        System.out.println("How much money do you have?");
        double chis;
        String resalt = "You have:";
        int i;
        int cent;
        int temp = 0;
        int k = 1000000;
        do {
            chis = sc.nextDouble();
        } while (chis > 10000000 && chis < 0);
        for (i = 0; i < 3; i++) {
            temp = (int) (chis / k) % 1000;
            if (temp != 0) {
                if (temp / 100 > 0) {
                    resalt = resalt + " " + chislo[(temp / 100) - 1] + " "
                            + val[3] + " ";
                }

                if (temp % 100 > 20) {
                    if (temp / 100 > 0)
                        resalt = resalt + "and ";
                    resalt = resalt + des[((temp % 100) / 10) - 2] + " "
                            + chislo[(temp % 10) - 1];
                }
                if (temp % 100 <= 20 && temp % 100 > 0) {
                    if (temp / 100 > 0)
                        resalt = resalt + "and ";
                    resalt = resalt + chislo[(temp % 100) - 1];
                }

                resalt = resalt + " " + val[i];
            }

            k /= 1000;
        }
        temp = (int) chis;
        if (temp > 0) {
            int dolar = (int) (chis % 10);
            if (dolar == 1) {
                resalt += "dollar ";
            } else {
                resalt += "dollars ";
            }
        }
        cent = (int) chis / 1;
        chis = Math.round((chis - cent) * 100);
        cent = (int) chis;
        System.out.println(cent);

        if (cent > 20) {
            if (cent % 10 != 0) {
                resalt = resalt + des[((cent) / 10) - 2] + " "
                        + chislo[(cent % 10) - 1] + " cent";
            } else {
                resalt = resalt + des[((cent) / 10) - 2] + " cent";

            }
        }
        if (cent <= 20 && cent > 0) {
            resalt = resalt + chislo[(cent % 100) - 1] + " cent";
        }

        System.out.println(resalt);

        sc.close();
    }

}
