import java.util.*;
public class simple {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount");
        int amount=sc.nextInt();
        System.out.println("Enter rate");
        double rate=sc.nextInt();
    
        int simple_intrest=(int)(amount*rate)/100;
        int total=simple_intrest+amount;
        System.out.println(simple_intrest);
        System.out.println(total);
    }
    
}
 
    

