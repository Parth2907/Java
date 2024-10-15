import java.util.*;
public class Day05_Area {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("CIRCLE");
        System.out.println("Enter radius:");
        int radius=sc.nextInt();
        float pi=3.14f;
        int area=(int)pi*radius*radius;
        System.out.println("Area of circle is :" + area);//Area of circle
        System.out.println("TRIANGLE");
        System.out.println("Enter Height:");

        int height=sc.nextInt();
       
        System.out.println("Enter base of triangle");
        int base=sc.nextInt();
        double areaoftriangle= base*height*0.5;
        System.out.println("Area of Triangle is :" + areaoftriangle);
        System.out.println("RECTANGLE");
        System.out.println("Enter width of rectangle:");
        int w=sc.nextInt();
        System.out.println("Enter length of rectangle:");
        int l=sc.nextInt();
        int areaofrect=l*w;
        System.out.println("Area of Rectangle is:"+ areaofrect);


    }
    
}
