import java.util.*;
public class Day_013_Palinromeupto1000 {
    public static void main(String args[])
    {
        for(int i=11;i<=1000;i++)
        {
            Scanner sc=new Scanner(System.in);
        
        int number=i;
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



        }

    }
    
}
