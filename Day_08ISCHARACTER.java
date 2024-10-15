import java.util.*;
public class Day_08ISCHARACTER {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any :");
        char check=sc.nextLine().charAt(0);
        if((check>=65 && check>=90) || (check>=97 && check <=122))
        {
            System.out.println(check +" is character");
        }
        else{
            System.out.println( check+ " is not character");
        }
        System.out.println((int)check);
    }

}
