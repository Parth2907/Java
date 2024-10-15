public class logicalandshortcircuit {
    public static void main(String[] args) {
        int x=10;
        int y=20;// logical
        if(++x<10 && y++<20)
        {
            x++;
        }
        else{
            y++;
        }
        System.out.println(x );
        System.out.println(y);


        int x1=10;
        int y1=20;// short circuit;
        if(++x<10 & y++<20)
        {
            x++;
        }
        else{
            y++;
        }
        System.out.println(x );
        System.out.println(y);
        
        
      int a,b,c,d;
      a=b=c=d=10;
      a/=b*=c+=d-=2;
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(d);
    }
    
}
