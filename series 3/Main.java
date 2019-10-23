#include<stdio.h>
int main()
{
    int n,p=0,q=1,t_n;
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
      t_n=p+q;
      p=q;
      q=t_n;
    }
    printf("%d",t_n);
}