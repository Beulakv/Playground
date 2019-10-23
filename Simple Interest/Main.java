import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
      int prin_amount,year;
      float r,si;
      Scanner sc=new Scanner(System.in);
      prin_amount=sc.nextInt();
      year=sc.nextInt();
      r=sc.nextFloat();
      si=prin_amount*year*r/100;
      System.out.println(si);
    }
}