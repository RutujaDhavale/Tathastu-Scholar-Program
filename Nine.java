import java.util.*;
  
public class Nine {  
   public static void main(String[] args) {  
      // creating an ArrayList having default size 5  
      ArrayList<String> arr = new ArrayList<String>(); 
      // Adding elements to the ArrayList  
      arr.add("How");  
      arr.add("are");  
      arr.add("you");  
      arr.add("?");  
      System.out.println("The list size : " + arr.size());  
      for (String name : arr) {  
         System.out.println("Name is: " + name);  
      }    
      arr.remove(1);  
      System.out.println("\nAfter removing the element the size of the ArrayList is: " + arr.size()); 
      for (String name : arr) {  
         System.out.println("Name is: " + name);  
      }  
   }  
}
//output
/*The list size : 4
Name is: How
Name is: are
Name is: you
Name is: ?

After removing the element the size of the ArrayList is: 3
Name is: How
Name is: you
Name is: ?
*/