import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // fill your code
    int len,bre;
    Scanner sc=new Scanner(System.in);
    len=sc.nextInt();
    bre=sc.nextInt();
    int a=(len+bre)*2;
    System.out.println(a+"m");
    int area=len*bre;
    System.out.println(area+"sqm");
    
  }
}