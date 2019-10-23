#include<stdio.h>
int square(int n)
{
  int square=n*n;
  return square;
}
int main() {
   // Type your code here
  int num;
  scanf("%d",&num);
  int square1=square(num);
  //num=square1;
  printf("%d",square1);
  
  // return 0;
}