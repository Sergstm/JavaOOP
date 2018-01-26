package homework.lesson11;

import java.math.BigInteger;

public class Task implements Runnable {

    private int num;

    Task(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        TransferData data = new TransferData();
        BigInteger factorial = new Factorial().get(num);
        String str = "factorial ".concat(String.valueOf(num));
        data.writeData(factorial, str);
    }
}
