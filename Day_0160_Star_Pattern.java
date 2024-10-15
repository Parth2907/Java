public class Day_0160_Star_Pattern {
    public static void main(String args[])
    {
        int n=8;

        for(int i=1;i<=n;i++)
        {
            for(int s=1;s<=n-i;s++)
            {
                System.out.print(" ");
            }
            for(int a=2;a<=i;a++)
            {
                System.out.print(" *");
            }
            System.out.println();
            
        }
        // for(int m=n-1;m>=0;m--)
        // {
        //     for(int k=1;k<=n-m;k++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j=2;j<=m;j++)
        //     {
        //         System.out.print(" *" );
        //     }
        //     System.out.println();

        // }
    } 
    
}
