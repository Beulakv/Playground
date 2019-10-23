#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d",&n);
  int val=0;
  for(int r=1;r<=n;r++)
  {
    for(int s=1;s<=n-r;s++)
    {
      printf(" ");
    }
    for(int c=1;c<=r;c++)
    {
      val=val+1;
      printf("%d ",val);
    }
    printf("\n");
  }
	return 0;
}