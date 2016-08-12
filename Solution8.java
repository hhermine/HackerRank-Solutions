//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
  public static void main(String []argh){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Map<String, Integer>  PhoneBook = new HashMap<String, Integer>();
    String name = new String();
    int phone = 0;

    for(int i = 0; i < n; i++){
      name = in.next();
      phone = in.nextInt();

      PhoneBook.put(name, phone);

    }

    while(in.hasNext()){
      String s = in.next();


      if(PhoneBook.containsKey(s)){

        System.out.println(s + "=" + PhoneBook.get(s)); 
      }
      else
      System.out.println("Not found");
    }

    in.close();
  }
}
