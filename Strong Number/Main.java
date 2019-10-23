#include <stdio.h>
int main()
{
    int num,i,l_digit,sum=0,temp,fact;
    scanf("%d", &num);
    temp=num;
    
        while(num>0)
        {
           l_digit=num%10;
            fact=1;
           for(i=1;i<=l_digit;i++)
            {
              fact=fact*i;
            }
            sum=sum+fact;
            num=num/10;
        }
    
    if(sum==temp)
     printf("Yes");
    else
     printf("No");
    return 0;
}