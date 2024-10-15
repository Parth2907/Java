import java.util.*;


public class Day_09_Switchcase {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter char");
    
    int a=sc.nextInt();
    int b=sc.nextInt();
    sc.nextLine();
    char ch=sc.nextLine().charAt(0);
    switch (ch) {
        case '+': System.out.println(+(a+b));
        break;
        case '-': System.out.println(+(a-b));
        break;
        case '*': System.out.println(+(a*b));
        break;
        case '/': System.out.println(+(a/b));
        break;
        case '%': System.out.println(+(a%b));
        default:
        System.out.println("Wrong input");
            break;
    }
    }

    
}
