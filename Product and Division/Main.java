import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
      int n1,n2;
      Scanner sc=new Scanner(System.in);
      n1=sc.nextInt();
      n2=sc.nextInt();
      int n3=n1*n2;
      int n4=n1/n2;
      int n5=n1%n2;
      System.out.println(n3+"\n"+n4+"\n"+n5);
    }
}