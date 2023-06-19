import java.util.ArrayList;

public class Solution {
    public static String kthPermutation(int n, int k) {
        // Write your code here.
        int[] fact = new int[]{1,1,2,6,24,120,720,5040,40320};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        int res = 0;
        k = k - 1;
        while (!list.isEmpty()) {
            res = res*10 + list.remove(k / fact[n-1]);
            k = k % fact[n-1];
            n = n - 1;
        }
        return res+"";
    }
}