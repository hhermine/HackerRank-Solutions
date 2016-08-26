import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         System.out.println(factorial(n));
        
    }
    
    public static int factorial(int n){
        
        if(n>1){
            return n*factorial(n-1);
        }
        else
            return n;
    }
}
