public class Day_017_PerfectFunction {
    public static boolean Perfect(int x)
    {
        int store=x;
        int sum=0;
        for(int i=1;i<store;i++)
        {
            
            if(x%i ==0)
            {
                sum=sum+i;
            }
        }
        return sum==x ?true:false;
    }
    public static void main(String args[])
    {
        for(int i=1;i<=1000;i++)
        {
            if(Perfect(i))
            System.out.println("Perfect "+i );
        }

    }
    
}
