import java.io.*;
import java.util.* ;

public class Solution {
    public static int modularExponentiation(int x, int n, int m) {
        // Write your code here.  
        long res = 1; // Initialize result
        long temp = x; // Initialise x in a long variable
 
        while (n > 0) {
 
            // If y is odd, multiply x with result
            if ((n & 1) != 0)
                res = ((res%m) * (temp%m))%m;
 
            // y must be even now
            n = n >> 1; // y = y/2
            // x = x * x; // Change x to x^2
            temp = ((temp%m) * (temp%m))%m;
        }
        return (int)res % m;     
    }
}