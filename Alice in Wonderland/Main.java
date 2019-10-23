import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      int n,x,sum=0;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      while(n>0)
      {
        x=n%10;
        n=n/10;
        sum=sum+x;
      }
      System.out.println("Alice must go in path-"+sum);
	}
}