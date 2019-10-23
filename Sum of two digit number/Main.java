#include<stdio.h>
int main()
{
  //Type your code here
  int num1,num2,num3,result;
  scanf("%d",&num1);
  num2=num1/10;
  num3=num1%10;
  result=num2+num3;
  printf("%d",result);
  return 0;
}