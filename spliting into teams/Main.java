import java.util.Scanner;
class Main
{
public static void main(String args[])
{
// fill your code
  int no_stu,no_rstu;
  Scanner sc=new Scanner(System.in);
  no_stu=sc.nextInt();
  no_rstu=sc.nextInt();
  System.out.println("The number of students in each team is "+no_stu/no_rstu+" and left out is "+no_stu%no_rstu);
  //System.out.println(no_stu%no_rstu);
}
}