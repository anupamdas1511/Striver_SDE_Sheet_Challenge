import java.util.* ;
import java.io.*; 
public class Solution {
    public static int romanToInt(String s) {
        // Write your code here
        int res = 0;
        for(int i=s.length()-1;i>=0;i--) {
            if(s.charAt(i) == 'I') {
                if(s.charAt(s.length()-1)=='V' || s.charAt(s.length()-1)=='X') res = res - 1;
                else res = res + 1;
            }
            if(s.charAt(i)=='V') res = res + 5;
            if(s.charAt(i)=='X') {
                if(i==s.length()-1) res = res + 10;
                else {
                    if(s.charAt(i+1)=='L' || s.charAt(i+1)=='C') res = res - 10;
                    else res = res + 10; 
                }
            }
            if(s.charAt(i)=='L') res = res + 50;
            if(s.charAt(i)=='C') {
                if(i==s.length()-1) res = res + 100;
                else {
                    if(s.charAt(i+1)=='D' || s.charAt(i+1)=='M') res = res - 100;
                    else res = res + 100; 
                }
            }
            if(s.charAt(i)=='D') res = res + 500;
            if(s.charAt(i)=='M') res = res + 1000;
        }
        return res;
    }
}