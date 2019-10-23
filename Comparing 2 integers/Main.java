import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill the code;
      int n1,n2;
      Scanner sc=new Scanner(System.in);
      n1=sc.nextInt();
      n2=sc.nextInt();
      if(n1>n2)
        System.out.println(n1+" greater than "+n2);
      else if(n2>n1)
        System.out.println(n1+" less than "+n2);
      else
        System.out.println(n2+" and "+n1+" are equal");
    }
}