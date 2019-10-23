import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      int shape;
      Scanner area=new Scanner(System.in);
      //len=area.nextInt();
      //bre=area.nextInt();
      shape=area.nextInt();
      switch(shape)
      {
        case 1:
          int side;
          side=area.nextInt();
          int square=side*side;
          System.out.println(square);
          break;
        case 2:
          int len,bre;
          len=area.nextInt();
          bre=area.nextInt();
          int rec=len*bre;
          System.out.println(rec);
          break;
        case 3:
          int base,height;
          base=area.nextInt();
          height=area.nextInt();
          int tri=(base*height)/2;
          System.out.println(tri);
          break;
        case 4:
          double radius;
          radius=area.nextDouble();
          double pi=3.1399999999999999d;
          double ar=pi*(radius*radius);
          System.out.println(ar);
          break;
        default:
          System.out.println("Invalid Input");
          break;
      }
    }
}