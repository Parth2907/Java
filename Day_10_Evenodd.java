import java.util.Scanner;
public class Day_10_Evenodd {
public static void main(String args[])
{
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter Start number:");
    int start=sc.nextInt();
    System.out.print("Enter end number");
    int end=sc.nextInt();
    int i;
    int evenstore=0;
    int oddstore=0;
    for(i=start;i<=end;i++)
    {
        if(i%2==0)
        {
            evenstore=evenstore+i;
            System.out.println("Even" +i);
        }
        else{
            oddstore=oddstore+i;
            System.out.println("Odd" +i);
        }
    }
    System.out.println("Even sum "+evenstore);
    System.out.println("Odd sum " + oddstore);
}
    
}
