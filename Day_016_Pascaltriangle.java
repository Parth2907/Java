public class Day_016_Pascaltriangle {
    public static void main(String args[])
    {
        int n=9;
        
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            int number=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(number +" ");
                number=number *(i-j)/(j+1);
                
            }
            System.out.println();
        }
    }
    
}
