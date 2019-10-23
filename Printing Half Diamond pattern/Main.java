#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d",&n);
  for(int r=1;r<=n;r++)
  {
    for(int s=n-r;s>=1;s--)
    {
      printf(" ");
    }
    for(int c=1;c<=(r*2)-1;c++)
    {
      printf("*");
    }
    printf("\n");
  }
return 0;
}