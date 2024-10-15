import java.util.*;
public class Studentspercentage {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("STUDENTS GRADE SYSTEM");
        int marathi=sc.nextInt();
        int English=sc.nextInt();
        int physics=sc.nextInt();
        int maths=sc.nextInt();
        int science=sc.nextInt();
        int total=marathi+English+physics+maths+science;
        System.out.println(total);
        double percentage= total/5;
        
        System.out.println("Percentage" + percentage);

    }
    
}
