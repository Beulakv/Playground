import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // fill your code
    int x1,y1,x2,y2;
    float x,y;
    Scanner sc=new Scanner(System.in);
    x1=sc.nextInt();
    y1=sc.nextInt();
    x2=sc.nextInt();
    y2=sc.nextInt();
    x=(float)(x1+x2)/2;
    y=(float)(y1+y2)/2;
    System.out.println("Binoy's house is located at ("+x+","+y+")");
  }
}