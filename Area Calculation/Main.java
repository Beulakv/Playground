import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      int side,len,bre;
      float r;
      float pi=3.14f;
      Scanner sc=new Scanner(System.in);
      side=sc.nextInt();
      len=sc.nextInt();
      bre=sc.nextInt();
      r=sc.nextFloat();
      int area=side*side;
      int ar=(len*bre);
      float a=pi*(r*r);
      System.out.printf("%d\n%d\n%.3f",area,ar,a);
    }
}