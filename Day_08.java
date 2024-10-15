import java.util.*;
public class Day_08 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
            int marathi=sc.nextInt();
            int english=sc.nextInt();
            int maths=sc.nextInt();
            int history=sc.nextInt();
            int geography=sc.nextInt();

            int avg=(marathi+english+maths+history+geography)/5;
            System.out.println(avg);
            if(avg>=100 && avg>=90)
            {
                System.out.println("A+");

            }
           else if(avg<90 && avg>=80)
            {
                System.out.println("A");

            }
            else if(avg<80 && avg>=70)
            {
                System.out.println("B+");

            }
            else if(avg<70 && avg>=60)
            {
                System.out.println("B");


            }
            else if(avg<60 && avg>=50)
            {
                System.out.println("C");

            }
            else if(avg<50 && avg>=40)
            {
                System.out.println("Pass");


            }
            else
            {
                System.out.println("Fail");

            }
            

        }
    }

