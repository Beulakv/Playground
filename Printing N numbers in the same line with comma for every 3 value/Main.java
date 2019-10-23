#include <stdio.h>
int main() {
	//Type your code
  int num,i,count=0;
  scanf("%d ",&num);
  for(i=1;i<=num;i++)
  {
    printf("%d",i);
    if(i%3==0)
       printf(",");
  }
	return 0;
}