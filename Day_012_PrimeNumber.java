import java.util.Scanner;

public class Day_012_PrimeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int flag = 1;
        if (number > 0) {
            if (number == 1) {
                flag = 0;
            } else {
                for (int i = 2; i < number; i++) {

                    if (number % i == 0) {
                        flag = 0;

                        break;
                    }

                }
            }
        
        if (flag == 1) {
            System.out.println(number + "Number is prime");
        } else {
            System.out.println(number + "is not prime");
        }
    }
    else
    {
        System.out.println( number+" is not prime");
    }
    }
}
