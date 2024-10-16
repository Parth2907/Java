public class Day_017_ArmstrongFunction {
    public static boolean Armstrong(int x)
    {
        int store= x;
        
        int sum=0;
        while(x>0){
         int rem=x%10;
        sum=sum+rem*rem*rem;
        x=x/10;
        }

        return sum==store? true:false;

        

    }
    public static void main(String args[])
    {
        for(int i=0;i<=1000;i++)
        {
           if(Armstrong(i))
           System.out.println("Armstrong" +i);
          
        }

    } 
    
}
