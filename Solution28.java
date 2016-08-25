import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    String nameSort = new String();
    for(int a0 = 0; a0 < N; a0++){
      String firstName = in.next();
      String emailID = in.next();



      String gmail = "@gmail.com";



      Pattern mail = Pattern.compile(gmail);
      Matcher match = mail.matcher(emailID);

      if(match.find()){

        nameSort = nameSort + " , " + firstName;

      }
    }

    String myDelimiter = ", ";
    String[] a = nameSort.split(myDelimiter);
    Arrays.sort(a);

    for(int i=1; i < a.length; i++){
      System.out.println(a[i]);}

    }

  }
