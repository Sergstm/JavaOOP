package homework.lesson1;

import java.io.InputStream;
import java.time.Month;
import java.util.Scanner;

public class GetMonthName {

    private Scanner scn;

    public GetMonthName(InputStream inputStream) {
        scn = new Scanner(inputStream);
    }

    public void printName() {
        System.out.println(Month.of(getInNumber()));
    }

    private int getInNumber() {
        int res;
        do {
            System.out.print("Enter month number: ");
            res = scn.nextInt();
        } while (!isMonth(res));
        return res;
    }

    private boolean isMonth(int num) {
        return num >= 1 && num <= 12;
    }
}
