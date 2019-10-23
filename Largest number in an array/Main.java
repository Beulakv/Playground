#include<stdio.h>
int main()
{
  int n,flag,idx;
  scanf("%d",&n);
  int arr[n];
  for( idx=0;idx<n;idx++)
  {
    scanf("%d",&arr[idx]);
  }
  int max=arr[0];
  for( idx=1;idx<n;idx++)
  {
      
    if(max<arr[idx]) 
    {
      max=arr[idx];
    }
  }
  printf("%d",max);
    return 0;
}