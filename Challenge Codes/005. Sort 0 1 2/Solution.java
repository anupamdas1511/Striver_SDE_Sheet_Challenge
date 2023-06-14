import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int zero = 0, one = 0, two = 0;
        for (int num: arr) {
            if (num==0) zero++;
            else if (num==1) one++;
            else if (num==2) two++;
        }
        int index = 0;
        while (index < arr.length) {
            if (zero > 0) {
                arr[index++] = 0;
                zero--;
            } else if (one > 0) {
                arr[index++] = 1;
                one--;
            } else if (two > 0) {
                arr[index++] = 2;
                two--;
            }
        }
    }
}