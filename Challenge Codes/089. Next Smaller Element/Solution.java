import java.util.*;
import java.io.*;

public class Solution{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        // Write your code here.
        ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(n, -1));

        int min = arr.get(n-1);
        for (int i=n-2;i>=0;i--) {
            if (arr.get(i+1) < arr.get(i)) {
                res.set(i, arr.get(i+1));
            } else {
                if (res.get(i+1) < arr.get(i)) {
                    res.set(i, res.get(i+1));
                } else if (min < arr.get(i)) {
                    int k = i+1;
                    while (arr.get(k) >= arr.get(i)) k++;
                    res.set(i, arr.get(k));
                } else {
                    res.set(i, -1);
                }
            }
            min = Math.min(min, arr.get(i));
        }

        return res;
    }
}