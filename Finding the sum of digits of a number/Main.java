#include <stdio.h>
int main() {
	//Type your code
  int num,s_digit=0;
  scanf("%d",&num);
  while(num!=0)
  {
    int remin=num%10;
    s_digit=s_digit+remin;
    num=num/10;
  }
  printf("%d",s_digit);
	return 0;
}