import java.util.*;
public class Day_08Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any :");
        int check=sc.nextInt();
        if(check>=0 && check<=9)
        {
            System.out.println(check +" is digit");
        }
        else{
            System.out.println( check+ " is Number");
        }
    }

}
