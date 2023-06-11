import java.util.* ;
import java.io.*; 
public class Solution {
    public static int atoi(String str) {
        // Write your code here.
        int a=0;
        StringBuilder s = new StringBuilder();
        if(str.charAt(0)=='-')
            s.append("-");
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                s.append(str.charAt(i));
            }
        }
        String ans = s.toString();
        try{
            a=Integer.parseInt(ans);}
        catch (NumberFormatException e){
            a = 0;
        }
        return a;
    }
}
