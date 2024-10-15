import java.util.*;
public class Power_Forloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base:");

        int a=sc.nextInt();

        System.out.print("Enter Power:");
        int pow=sc.nextInt();
        int store=1;
        for(int i=0;i<=pow;i++)
        {
            store=store*a;
        }
        System.out.println(store);
    }
    
}
