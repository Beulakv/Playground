#include <stdio.h>
#include<math.h>
int main()
{
    int number, sum = 0, rem = 0, cube = 0, temp,l_num;
    scanf("%d", &number);
    temp = number;
    l_num = number;
    int count = 0;
    while(number > 0)
    {
        count++;
        number = number/10;
        
    }
    while (temp > 0)
    {
        rem = temp % 10;
        cube = pow(rem, count);
        temp = temp / 10;
        sum = sum + cube;
        
    }
    if (sum == l_num)
        printf ("Armstrong Number");
    else
        printf ("Not an Armstrong Number");
	return 0;
}