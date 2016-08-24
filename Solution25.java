import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    int n = 0;
    boolean isPrime = false;


    for(int i=0; i<T; i++){
      n = sc.nextInt();
      int k = Math.abs(n/2);


      for(int j=2;j<n-k; j++){

        if (n%j == 0){
          isPrime = false;

          break;
        }

          else {
              isPrime = true;
          }
      }

      if(isPrime == true || n==2){

        System.out.println("Prime");}

        else if(isPrime == false){
          System.out.println("Not prime");
        }

      }
    }
  }
