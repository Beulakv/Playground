import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
      float f1,f2,f3,f4,f5;
      Scanner sc=new Scanner(System.in);
      f1=sc.nextFloat();
      f2=sc.nextFloat();
      f3=sc.nextFloat();
      f4=sc.nextFloat();
      f5=sc.nextFloat();
      float total=f1+f2+f3+f4+f5;
      float avg=total/5;
      System.out.println(avg);
    }
}