import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int[n];
    for(int i=0; i < n; i++){
      a[i] = in.nextInt();

    }

    int firstElement = 0;
    int lastElement =0;
    int numSwaps = 0;

    for(int i=0; i<n; i++){


      for(int j = 0; j < n - 1; j++){

        if(a[j] > a[j+1]){

          int temp = a[j];
          a[j] = a[j+1];
          a[j+1]=temp;

          numSwaps++;
        }
      }

      firstElement = a[0];
      lastElement = a[n-1];

    }

    System.out.println("Array is sorted in " + numSwaps + " swaps.");
    System.out.println("First Element: " + firstElement);
    System.out.println("Last Element: " + lastElement);

  }
}
