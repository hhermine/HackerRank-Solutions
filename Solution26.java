import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int returnDay = sc.nextInt();
    int returnMonth = sc.nextInt();
    int returnYear = sc.nextInt();
    int expectDay = sc.nextInt();
    int expectMonth = sc.nextInt();
    int expectYear = sc.nextInt();

    if(expectYear < returnYear){

      System.out.println(10000);
    }
    else

    if(expectYear == returnYear && expectMonth < returnMonth)
    {
      System.out.println(500 * (returnMonth - expectMonth));
    }
    else

    if(expectYear == returnYear && expectMonth == returnMonth && expectDay < returnDay){

      System.out.println(15 * (returnDay - expectDay));

    }

    else{
      System.out.println(0);
    }
  }
}
