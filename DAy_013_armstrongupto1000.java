public class DAy_013_armstrongupto1000 {
    public static void main(String args[])
    {
       for(int i=1;i<=1000;i++){
        int number=i;
        int store=0;
        int temp=number;
      
        while(number>0)
        {
            int mod=number%10;
            store=store+(mod*mod*mod);
            number=number/10;

        }
        if(temp==store)
        {
         
            System.out.println(store );


        }
        
    }
    }
    
}
