import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
  public static void main(String[] args) {
  
    Scanner scan = new Scanner(System.in);
    
    String even = new String();
    String odd = new String();
    String first = scan.next();
    
    for(int j=0;j<1000;j++){
      String s = scan.next(); 
      
      char [] ch = s.toCharArray();
      
      for(int i=0;i<s.length();i++){
        
        
        if(i%2==0){
          
          
          even = even + Character.toString(ch[i]);}
          
          
          else{
            
            odd = odd+ Character.toString(ch[i]);}
            
          }
          
          System.out.println(even + " " + odd);
          even = "";
          odd = "";
          
        }
        
        
      }
    }
