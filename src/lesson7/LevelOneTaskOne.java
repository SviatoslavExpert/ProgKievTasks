

package lesson7;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class LevelOneTaskOne {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Calendar calOne = Calendar.getInstance();
        Calendar calTwo = Calendar.getInstance();

        calTwo.set(Calendar.MONTH, calOne.get(Calendar.MONTH) - 1);

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy");

        Date dateOne = calOne.getTime();
        Date dateTwo = calTwo.getTime();

        long t = dateOne.getTime() - dateTwo.getTime();

        System.out.println("From " + sdf.format(calOne.getTime()) + " to " + sdf.format(calTwo.getTime()) + ":");
        System.out.println(t + " milliseconds");
    }
}
