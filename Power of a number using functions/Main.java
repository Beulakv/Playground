#include<stdio.h>
int power(int a,int b);
int main(){
    // Type your code here
  int n1,n2;
  scanf("%d %d",&n1,&n2);
  printf("%d",power(n1,n2));
  	//return 0;
}
int power(int a,int b)
{
  int r=pow(a,b);
  return r;
  
}