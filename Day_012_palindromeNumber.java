import java.util.*;
public class Day_012_palindromeNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number");
        int number=sc.nextInt();
        int num=number;
        int store=0;
        while(number>0){
            int mod=number%10;
            store=store*10+mod;
            number=number/10;
        }
        if(store==num)
        {
            System.out.println(num+" is palindrome");


        }
        else
        {
            System.out.println(num+ " is not palindrome");
        }

    }
}
