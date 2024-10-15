import java.util.*;
public class Simpleintrest {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount");
        int amount=sc.nextInt();
        System.out.println("Enter years");
        int years=sc.nextInt();
        double rate=sc.nextInt();
        int simple_intrest=(int)(amount*years*rate)/100;
        int total=simple_intrest+amount;
        System.out.println(total);
    }
    
}
