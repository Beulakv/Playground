// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int n;
  scanf("%d",&n);
  int list[n];
  for(int i=0;i<=n-1;i++)
  {
    scanf("%d",&list[i]);
  }
  int f=0,max_i=0;
  for(int i=0;i<=n-1;i++)
  {
    if(list[f]<list[i])
    {
      max_i=i;
    }
  }
  printf("%d",max_i);
   return 0;
}