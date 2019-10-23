#include<stdio.h>
int power(int a);
int main(){
    // Type your code here
  int n1=2,n2,pr=1;
  scanf("%d",&n2);
  for(int i=2;i<=n2;i++)
  {
    int pri=prime(i);
    if(pri==1)
    {
        printf("%d\n",i);
    }
  }
  
  	//return 0;
}
int prime(int n)
{
 int num=2,p=1;
 while(num<=n/2)
 {
     if(n%num==0)
     {
         p=0;
         break;
     }
     num=num+1;
 }
 return p;
}