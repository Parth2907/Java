import java.util.*;
public class Day_014_Pattern {
    public static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int no=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            no++;
            System.out.println();

        }
    }
}
