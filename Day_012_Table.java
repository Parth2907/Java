import java.util.*;
public class Day_012_Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int store=1;
        for(int i=1;i<=10;i++)
        {
            
            System.out.println(number+"*" + i + "="+ number*i );
        }
    }
}
