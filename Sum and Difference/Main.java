import java.util.Scanner;
class Main
{
    	public static void main(String args[])
        {
            int num1,num2,num3;
          Scanner sc=new Scanner(System.in);
          num1=sc.nextInt();
          num2=sc.nextInt();
          num3=num1+num2;
          int num4=num1-num2;
          System.out.println(num3+"\n"+num4);
        }
}