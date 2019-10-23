import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      char a;
      Scanner sc=new Scanner(System.in);
      a=sc.next().charAt(0);
      if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
        System.out.println("Vowel");
      else if(a>='0' && a<'9' || a>=1 && a<=48)
        System.out.println("Not an alphabet");
      else
        System.out.println("Consonant");
    }
}