import java.io.*;
import java.util.* ;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        Set<Integer> set = new HashSet<>();
        for (int num: arr) {
            if (!set.add(num)) return num;
        }
        return -1;
    }
}