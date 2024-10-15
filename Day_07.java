import java.util.*;
public class Day_07 {
    public static void main(String args[])
    {
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter the digit:");
        // int a=sc.nextInt();
        // System.out.println(a%10);
        // System.out.println((a/100)%10);
        // System.out.println(a%1000);
        // int year=1900;
        // if((year%4)==0 && (year%100)!=0 || year%400==0 )
        // {
        //     System.err.println( year +" is a leap year");
        // }
        // // else if(year%400==0)
        // // {
        // //     System.out.println(year +" is a leap year");
        // // }
        // else
        // {
        //     System.out.println(year +"is not a leap year");
        // }
        // //4 ni gela ani 100  ni nahi gela
        // //kiva 400 ni gela tar leap year 
        int a=100;
        int b=60;
        int c=1000;
        if(a>b && a>c)
        {
            System.out.println("A is greater");
        }
        else if(b>a && b>c)
        {
            System.out.println("B is greater");

        }
        else
        {
            System.out.println("C is greater");
        }
        
       
    }

    
}
