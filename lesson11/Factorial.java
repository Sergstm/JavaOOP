package homework.lesson11;

import java.math.BigInteger;

public class Factorial {

    public BigInteger get(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N<0 n=" + n);
        }
        BigInteger res = BigInteger.ONE;
        if (n == 0) {
            return BigInteger.ONE;
        } else {
            for (int i = 0; i < n; i++) {
                res = res.multiply(new BigInteger(String.valueOf(i)).add(BigInteger.ONE));
            }
        }
        return res;
    }
}
