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
      n1=n1+n2;
      n2=n1-n2;
      n1=n1-n2;
      System.out.println(n1+"\n"+n2);
    }
}