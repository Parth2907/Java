public class Day_13_Perfectupto1000 {
    public static void main(String args[])
    {
        
         for(int i=1;i<=1000;i++)
         {
            int store=0;
            int number=i;
            int temp=number;
            for(int j=1;j<number;j++)
            {
                if(number%j==0)
                {
                    store=store+j;
                }
              
               
                
            }
            if(store==temp)
            {
                System.out.println(store);

            }
        }
    }
    
}
