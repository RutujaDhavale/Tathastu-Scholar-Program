
import java.util.*;

public class Fifth {
   static int factorial(int n) {
      int fact = 1;
      int i = 1;
      while(i <= n) {
         fact *= i;
         i++;
      }
      return fact;
   }
   public static void main(String args[]) {
     
      int n , r , comb, per;
      Scanner s= new Scanner(System.in);
      System.out.println("To calculate the nCr and nPr values, we need 'n' and 'r' value ");
        System.out.println("Enter the value of n : ");
        n = s.nextInt();

    System.out.println("Enter the value of r : ");
        r = s.nextInt();
      
      per = factorial(n) / factorial(n-r);
      System.out.println("Permutation: " + per);
      comb = factorial(n) / (factorial(r) * factorial(n-r));
      System.out.println("Combination: " + comb);
   }
}
//output
/*To calculate the nCr and nPr values, we need 'n' and 'r' value 
Enter the value of n : 
4
Enter the value of r : 
6
Permutation: 24
Combination: 0*/