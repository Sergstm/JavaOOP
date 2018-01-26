package homework.lesson11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Runner {
    public static void main(String[] args) {

        System.out.println("Start");
        long from = System.currentTimeMillis();

        int k = 10;
        int n = 5;

        ExecutorService service = Executors.newFixedThreadPool(n);
        for (int i = 1; i <= n; i++) {
            service.submit(new Task(i*k));
        }
        service.shutdown();

        try {
            service.awaitTermination(1000, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long to = System.currentTimeMillis();
        System.out.println("End. Time = " + (to -from) /1000.0 + " sec");
    }
}
