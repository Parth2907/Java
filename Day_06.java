import java.util.*;
public class Day_06 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        // // System.out.println("Enter value of A:");
        // // int a=sc.nextInt();
        // // System.out.println("ENter value of B");
        // // int b=sc.nextInt();
        // // if(a>b)
        // // {
        // //     System.err.println("A is greater than B");
        // // }
        // // else
        // // {
        // //     System.out.println("B is Greater than A");
        // // }
        // System.out.println("Enter the value");
        // int num=sc.nextInt();
        // if(num%2==0)
        // {
        //     System.out.println("Number is Even");
        // }
        // else
        // {
        //     System.out.println("Number is Odd");
        // }

        // int check=sc.nextInt();
        // if(check>=0)
        // {
        //     System.out.println("Number is positve");
        // }
        // else
        // {
        //     System.out.println("Number is negative");
        // }
        // System.out.println("ENter number for which byo want to check divisibility ");
        // int number=sc.nextInt();
        // System.out.println("ENter divisor");
        // int divisor=sc.nextInt();
        // if(number%divisor ==0)
        // {
        //     System.out.println("Number " + number + "is Divisible by "+ divisor  +   " or is Multiple of " + divisor);

        // }
        // else{
        //     System.out.println("Number "+ number+ "is not divisible by"+divisor +"  or Multiple of " + divisor);
        // }
        System.out.println("Enter operator(+,-,*,/,%)");
        char operator=sc.nextLine().charAt(0);
        int number=sc.nextInt();
        int number2=sc.nextInt();
        
        if(operator == '+')
        {
            System.out.println(number+number2);
        }
        else if (operator == '-')
        {
            System.out.println(number-number2);
        }
        else if(operator == '*')
        {
            System.out.println(number* number2);
        }
        else if(operator =='%')

        {
            System.out.println(number%number2);


        }
        else if(operator== '/')
        {
            System.out.println(number/number2);
        }
        else
        {
            System.out.println("You haved entered wrong operator");
        }
        
    }
    
}
