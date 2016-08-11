

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int concecutive = 1;
        int max=0;
   //   int  temp ;
        String bin = Integer.toBinaryString(n);
        char binchar [] = bin.toCharArray();
     
        for(int i=0;i<binchar.length-1;i++){
            
          
            if (binchar[i] == '1' && binchar[i]==binchar[i+1]){
              
                concecutive++;
            }
            else if (binchar[i]=='0'){
              if(max<concecutive){
                  max=concecutive;
              }
                
                concecutive = 1;
              
             
            }
     
        }
         
      
        if(max>concecutive){
            System.out.println(max);}
        else{
            System.out.println(concecutive);
        }
            
    }
}