public class Day_11_Whileloop {


public static void main(String args[])
{
    int a=1878;
    // while(a>0)
    // {
    //     System.out.println(a%10);
    //     a=a/10;
    // }
//     int i=0;
//     while(a>0)
//     {
//         int rem=a%10;   
//         i+=rem;
//         a=a/10;
        

//     }
//     System.out.println("Sum is " +i);
// }
int armstrong=153;
int store=0;
int temp=armstrong;
while(armstrong>0)
{
    int mod=armstrong%10;
    store=store+(mod*mod*mod);
    armstrong=armstrong/10;

}
if(store==temp)
{
    System.out.println(temp +" is an armstrong number");
}
else
{
    System.out.println(temp + "is not armstrong number");
}

}}