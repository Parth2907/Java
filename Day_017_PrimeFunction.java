public class Day_017_PrimeFunction {
    public static boolean Prime(int x)
    {
        int flag=1;
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            {
                flag=0;
                break;
            }
        }
        return flag==1?true:false;
    }
    public static void main(String args[])
    {
        for(int i=2;i<=1000;i++)
        {
            if(Prime(i))
            System.out.println("Prime "+i);
        }
    }
    
}
