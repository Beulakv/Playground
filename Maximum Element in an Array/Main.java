import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,i,j,temp=0;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int arr[]=new int[15];
      for(i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      for(i=0;i<n;i++)
      {
        for(j=i+1;j<n;j++)
        {
          if(arr[j]>arr[i])
          {
            temp=arr[j];
          }
        }
      }
      System.out.println(temp+" is the maximum element in the array");
    }
}