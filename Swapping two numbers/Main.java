import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
      int n1,n2,temp;
      Scanner sc=new Scanner(System.in);
      n1=sc.nextInt();
      n2=sc.nextInt();
      temp=n1;
      n1=n2;
      n2=temp;
      System.out.println(n1+"\n"+n2);
    }
}