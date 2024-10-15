public class Day_012_Prime_continue {
    public static void main(String args[]) {
        
       
        for (int j = 2; j <= 100; j++) {
            int flag = 1;
            int number = j;

            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    flag = 0;

                    break;
                }

            }
        

        if (flag == 1) {
            System.out.println(number);
        } 
    }

    }

}
