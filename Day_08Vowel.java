import java.util.*;
public class Day_08Vowel {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        char vowel=sc.nextLine().charAt(0);
        if(vowel=='a' || vowel=='e' || vowel=='i' ||vowel=='o' || vowel=='u' || vowel=='A' || vowel=='E' || vowel=='a'|| vowel=='O' || vowel=='U')
        {
            System.out.println( vowel +" is a vowel");

        }
        
        else
        {
            System.out.println( vowel + " is not a vowel");
        }
    }
    
}
