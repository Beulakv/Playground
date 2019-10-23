#include<stdio.h>
int sum(int num)
{
  int sum=0;
  for(int n=1;n<=num;n++)
  {
    sum=sum+n;
  }
  return sum;
}
int main() {
    // Type your code here
    int n;
    scanf("%d",&n);
    int sum1=sum(n);
    printf("%d",sum1);
  //	return 0;
}