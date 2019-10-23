import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      int x,b,a,profit;
      Scanner sc=new Scanner(System.in);
      x=sc.nextInt();
      b=sc.nextInt();
      a=sc.nextInt();
      profit=(x*b)-(x*a)-100;
      System.out.println("The profit obtained is Rs."+profit);
	}
}