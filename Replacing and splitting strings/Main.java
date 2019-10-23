import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      String str1,str2;
      int no_parts;
      Scanner str=new Scanner(System.in);
      str1=str.nextLine();
      str2=str.nextLine();
      no_parts=str.nextInt();
      String str3=(str1.replace(str1,str2));
      String[] str4=str3.split("\\s");
      for(String value : str4)
      {
          System.out.println(value);
      }
    }
}