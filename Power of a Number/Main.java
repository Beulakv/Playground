import java.util.Scanner;
import java.lang.Math;
class Main
{
    public static void main(String args[])
    {
        // fill your code
      int n1,n2;
      double n3;
      Scanner sc=new Scanner(System.in);
      n1=sc.nextInt();
      n2=sc.nextInt();
       n3=Math.pow(n1,n2);
      System.out.println(n3);
    }
}