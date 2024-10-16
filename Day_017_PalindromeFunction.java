public class Day_017_PalindromeFunction {
    public static boolean Palindrome(int x)
    {
        int store=x;
        int sum=0;
        while(x>0)
        {
            int mod=x%10;
            sum=sum*10+mod;
            x=x/10;
        }
        return sum==store? true:false;
    }
    public static void main(String args[])
    {
        for(int i=11;i<=1000;i++)
        {
            if(Palindrome(i))
            System.out.println("Palindrome "+i);
        }
    }
    
}
