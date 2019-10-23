import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      int base,exponent,power;
      Scanner p=new Scanner(System.in);
      base=p.nextInt();
      exponent=p.nextInt();
     
      int pow=1;
      for(int i=1;i<=exponent;i++)
      {
        pow=pow*base;
      }
      System.out.println(pow);
    }
}