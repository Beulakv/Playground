#include<stdio.h>
int main()
{
  //Type your code here
  int number,result,digit;
  scanf("%d",&number);
  result=number/10;
  digit=result%10;
  printf("%d",digit);
  return 0;
}