public class Day_017_ForFunction {
    public static boolean OddorEven(int number)
    {
         return number%2 ==0 ? true:false;
    
    }
    public static void main(String args[])
    {
        int start=0;
        int end=100;
        for(int i=start;i<=end;i++)
        {
            if(OddorEven(i)==true)
            System.out.println("Even" + i);
            else
            System.out.println("Odd " + i);
            
        }

    }
    
}
