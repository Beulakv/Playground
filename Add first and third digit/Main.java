#include<stdio.h>
int main()
{
  //Type your code here
  int num,num1,num2,result;
  scanf("%d",&num);
  num1=num/100;
  num2=num%10;
  result=num1+num2;
  printf("%d",result);
  return 0;
}