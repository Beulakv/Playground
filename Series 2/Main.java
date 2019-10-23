#include <stdio.h>

int main()
{
    int e=0,w=0,c=0,n;
    scanf("%d",&n);
    while(c!=n)
    {
        e=e+2;
        c++;
        if(c!=n)
        {
            w=w+1;
            c++;
        }
    }
    if(n%2==0)
      printf("%d",w-1);
    else
      printf("%d",e-2);
    return 0;
}
