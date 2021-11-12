import java.util.Scanner;

public class First {
  public static void main(String[] args) {

    char operator;
    int ex;
    Double number1, number2,res;
   do
   {
    Scanner input = new Scanner(System.in);

    System.out.println("Choose an operator: +, -, *, or /");  //  to enter operator
    operator = input.next().charAt(0);


    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    number2 = input.nextDouble();

    switch (operator) {


      case '+':
       res = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + res); //addition
        break;


      case '-':
      res = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + res);    // subtraction 
        break;

     
      case '*':
       res = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + res);  //  multiplication 
        break;


      case '/':
      res= number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + res);       //  division 
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }
     System.out.println("Do you want to continue?1.Yes 2.No");
    ex=input.nextInt();
    }while(ex==1);
  }
}

//output
/*Choose an operator: +, -, *, or /
+
Enter first number
5
Enter second number
2
5.0 + 2.0 = 7.0
Do you want to continue?1.Yes 2.No
1
Choose an operator: +, -, *, or /
-
Enter first number
5
Enter second number
2
5.0 - 2.0 = 3.0
Do you want to continue?1.Yes 2.No
1
Choose an operator: +, -, *, or /
*
Enter first number
5
Enter second number
2
5.0 * 2.0 = 10.0
Do you want to continue?1.Yes 2.No
1
Choose an operator: +, -, *, or /
/
Enter first number
5
Enter second number
3
5.0 / 3.0 = 1.6666666666666667
Do you want to continue?1.Yes 2.No
2
/*