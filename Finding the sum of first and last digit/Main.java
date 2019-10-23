#include <stdio.h>
int main() {
	//Type your code
  int num,f_num,l_num,sum_digit=0;
  scanf("%d",&num);
  l_num=num%10;
  f_num=num;
  while(num>=10)
  {
    num=num/10;
  }
  f_num=num;
  sum_digit=f_num+l_num;
  printf("%d",sum_digit);
    return 0;
}