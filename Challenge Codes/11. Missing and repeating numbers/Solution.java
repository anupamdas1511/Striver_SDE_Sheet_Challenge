import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.math.BigInteger;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        BigInteger sum = BigInteger.ZERO;
        BigInteger sumN = BigInteger.valueOf(n).multiply(BigInteger.valueOf(n+1)).divide(BigInteger.valueOf(2));
        BigInteger sum2 = BigInteger.ZERO;
        BigInteger sumN2 = BigInteger.valueOf(n).multiply(BigInteger.valueOf(n+1)).multiply(BigInteger.valueOf(2*n+1)).divide(BigInteger.valueOf(6));

        for (int num: arr) {
            sum = sum.add(BigInteger.valueOf(num));
            sum2 = sum2.add(BigInteger.valueOf(num * num));
        }

        BigInteger x_minus_y = sum.subtract(sumN);
        BigInteger x_plus_y = sum2.subtract(sumN2);
        x_plus_y = x_plus_y.divide(x_minus_y);

        int repeating = x_minus_y.add(x_plus_y).divide(BigInteger.valueOf(2)).intValue();
        int missing = BigInteger.valueOf(repeating).subtract(x_minus_y).intValue();

        return new int[]{missing, repeating};

    }
}