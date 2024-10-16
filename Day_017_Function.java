import java.util.Scanner;
public class Day_017_Function {

    
    public static int Addition(int x, int y)
    {
        return x+y;
    }
    public static int Substraction(int x, int y)
    {
        return x-y;
    }
    public static int Multiplication(int x, int y)
    {
        return x*y;
    }
    public static int Divison(int x, int y)
    {
        return x/y;
    }
    public static int Mod(int x, int y)
    {
        return x%y;
    } 

    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        char ch=sc.nextLine().charAt(0);
        switch(ch)
        {
            case '+' :
            System.out.println(Addition(10,5));
            break;
            case '-' :
            System.out.println(Substraction(10,5));
            break;
            case '*':
            System.out.println(Multiplication(10, 5));
            break;
            case '/':
            System.out.println(Divison(10, 5));
            break;
            case '%':
            System.out.println(Mod(10, 5));
            break;
            default:
            System.out.println("Enter valid operator");
            break;
        }
        
    }
    
}
