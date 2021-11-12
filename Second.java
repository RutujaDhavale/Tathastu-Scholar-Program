
import java.util.*;
 
 
public class Second{ 
    public static void main(String[] args) {
        
        int first = 0;
        int second = 1;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println(" Number of elements you want to print in a Fibonacci series");
        int n = in.nextInt();
        
        System.out.println("Fibonacci series");
        System.out.print(first + " "+ second + " ");
        
        int next;
        
        int i = 2;

        while(i < n) {
            
            next = first + second;
            
            System.out.print(next + " ");
            
            first = second;
            second = next;
        
            i++;
        }
        
    }
    
}

//output
/*Number of elements you want to print in a Fibonacci series
7
Fibonacci series
0 1 1 2 3 5 8*/