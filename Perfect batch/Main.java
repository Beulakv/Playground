/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<=n-1;i++)
  {
    scanf("%d",&arr[i]);  
  }
  int add=0,sum=0;
  for(int i=0;i<n/2;i++)
  {
    add=add+arr[i];
  }
  for(int i=n/2;i<n;i++)
  {
    sum=sum+arr[i];
  }
  if(add==sum)
    printf("Perfect Batch");
  else
    printf("Not a Perfect Batch");
  return 0;
}