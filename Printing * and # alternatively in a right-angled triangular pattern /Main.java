#include <stdio.h>
int main(){
	// Type your code here
  int n;
  int count=1;
  scanf("%d",&n);
  for(int row=1;row<=n;row++)
  {
    for(int col=1;col<=row;col++)
    {
      if(count%2==0)
      {
        printf("#");
        count=1;
      }
      else
      {
        printf("*");
      count=2;
      }
      
    }
    printf("\n");
    //count++;
  }
  	return 0;
}