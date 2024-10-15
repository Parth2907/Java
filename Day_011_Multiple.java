import java.util.Scanner;
public class Day_011_Multiple {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int multiple=sc.nextInt();
        int sum=0;
        for(int i=1;i<multiple;i++)
        {
            if((multiple%i)==0)
            {
                sum=sum+i;
                System.out.println("Multiple of "+multiple+ " are:" +i );
                

            }
            

        }
        if(sum==multiple)
        {
            System.out.println("It is perfect number");
        }
        else{
            System.out.println("It is not perfect number");
        }
        System.out.println(sum);
    }
    
}
