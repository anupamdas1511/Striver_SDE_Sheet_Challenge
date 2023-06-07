import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int price = 0, min = Integer.MAX_VALUE;
        for (int i=0;i<prices.size();i++) {
            int cost = prices.get(i) - min;
            price = Math.max(price, cost);
            min = Math.min(min, prices.get(i));
        }
        return price;
    }
}