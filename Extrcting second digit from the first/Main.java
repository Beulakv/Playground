#include <stdio.h>
int main() {
	//Type your code
  int num,s_num;
  scanf("%d",&num);
  while(num>10)
  {
    s_num=num%10;
    num=num/10;
  }
  printf("%d",s_num);
	return 0;
}