#include<stdio.h>
int main()
{
  //Type your code here
  int n,idx;
  scanf("%d",&n);
  int arr[n];
  for( idx=0;idx<n;idx++)
  {
    scanf("%d",&arr[idx]);
  }
  int s_e1,s_e2;
  int s_eidx1=-1,s_eidx2=-1;
  scanf("%d%d",&s_e1,&s_e2);
  for( idx=0;idx<n;idx++)
  {
      
    if(s_e1==arr[idx]) 
    {
      s_eidx1=idx;
    }
    if(s_e2==arr[idx])
    {
        s_eidx2=idx;
    }
   
  }
  printf("%d\n%d",s_eidx1,s_eidx2);
    return 0;
}