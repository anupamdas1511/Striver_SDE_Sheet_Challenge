import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<Integer> subsetSum(int num[]) {
        // Write your code here..
        ArrayList<Integer> res = new ArrayList<>();
        func(num, 0, 0, res);
        Collections.sort(res);
        return res;
    }

    private static void func(int[] num, int index, int total, ArrayList<Integer> res) {
        if (index == num.length) {
            res.add(total);
            return;
        }
        
        func(num, index+1, total+num[index], res);
        func(num, index+1, total, res);
    }

}