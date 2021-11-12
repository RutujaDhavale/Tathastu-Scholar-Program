import java.util.*;
public class third{

    public static void main(String[] args) {
        int number;
        System.out.println("Enter the number: ");
        Scanner no = new Scanner(System.in);
        number = no.nextInt();
        long fact = 1;
        int i = 1;
        while(i<=number)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}

//output
/*Enter the number: 
3
Factorial of 3 is: 6*/
