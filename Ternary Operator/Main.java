import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
      int num;
      Scanner sc=new Scanner(System.in);
      num=sc.nextInt();
      if(num%2==0?true:false)
      {
        System.out.println("Even");
      }
      else
      {
        System.out.println("Odd");
      }
    }
}