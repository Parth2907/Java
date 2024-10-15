import java.util.Scanner; 
public class Day04 {
    public static void main(String args[])
    {
        // String a="Parth";
        // int b=20;
        // int c=30;
        // int d=40;
        // System.out.println(a+b+c+d);
        // System.out.println(b+a+c+d);
        // System.out.println(b+c+a+d);
        // System.out.println(b+c+d+a);
        // String a="Path";
        // int b=20;
        // int c=30;
        // int d=40;
        // a=a+b+c+d;
        // System.out.println(a);
        // b=d+c;
        // System.out.println(b);
        // a=b+d+c;
       
        // System.out.
        // int z=~(-4);
        // System.out.println(z);
        // System.out.println(20<30>54); 
        // System.out.println('a'>92<55);   
        // String w=null;       
        // System.out.println(w!= null);
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of a");
        int a=sc.nextInt();
        System.out.println("Enter value of b");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Addition is " + c);
        int d=a-b;
        System.out.println("Substraction is " + d);
        int e=a*b;
        System.out.println("Multiplication is " + e);
        int f=a/b;
        System.out.println("Divison  is " + f);
        int i=a%b;
        System.out.println("Remainder is " + i);

        

    }

}
