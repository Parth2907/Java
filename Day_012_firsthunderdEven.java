public class Day_012_firsthunderdEven {
    public static void main(String args[])
    {
        int odd=0;
        int even=0;
        for(int i=0;i<=100;i++)
        {
            if(i%2==0)
            {
                even=even+i;
            }
            else{
                odd=odd+i;
            }
        }
        System.out.println("Sum of Odd number from 1 to 100:" + odd);
        System.out.println("Sum of even number from 1 to 100:" + even);
        
    }
    
}
