package homework.lesson11;

import java.io.*;
import java.math.BigInteger;

public class TransferData {

    public void writeData(BigInteger num, String fileName) {
        String path = "src/homework/lesson11/files/".concat(fileName).concat(".txt");
        File file = new File(path);
        String data = String.valueOf(num);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(data);
            System.out.println("Writing Success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
