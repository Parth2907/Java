public class Day_10_reverseprintonly {
    public static void main(String args[])
    {
        int number=987;
        int store;
        int revno=0;
        // while(number>0)
        // {
        //     int temp=number%10;
        //     revno=revno*10 +temp;
        //     number=number/10;
        //     System.out.println(revno);
        
        // }
        // int a=10;
        // int b=30;
        // int temp=0;
        //  temp=a;
        // a=b;
        // b=temp;
        // System.out.println(a+" A ");
        // System.out.println(b +"B");//using third variable

        // without using third variables 
        int a=10;
        int b=40;
        a=a ^ b;
        b=a ^ b;
        a=a ^ b;
        System.out.println("A" + a);
        System.out.println("B" + b);
    }


   

}
