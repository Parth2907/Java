import java.util.*;
public class Day_011_Factorial {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int fact=sc.nextInt();
        int store=1;
        for(int i=1;i<=fact;i++)
        {
            store=store*i;

        }
        System.out.println(store);

    }
    
}
