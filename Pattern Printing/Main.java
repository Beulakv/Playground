import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      int n,i,j;
      Scanner in=new Scanner(System.in);
      n=in.nextInt();
      for(i=n;i>0;i--)
      {
        for(j=n;j>0;j--)
        {
          if(i<=j)
          {
            System.out.print(j);
          }
          else
          {
            System.out.print(i);
          }
        }
        System.out.println();
      }
    }
      
}