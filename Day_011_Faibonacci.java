import java.util.*;
public class Day_011_Faibonacci {
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int inp=sc.nextInt();
        int store;
        int prev=0;
        int next=1;
        System.out.println(prev);
        
        for(int i=1;i<=inp;i++)
        {

            
                store=prev+next;
                System.out.println(store);
                prev=next;
                next=store;

            

        }
    }
    
}
