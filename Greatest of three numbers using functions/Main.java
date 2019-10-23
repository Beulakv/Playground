#include <stdio.h>
int great(int n1,int n2,int n3);
int main()
{ 
  int n,m,p;
  //int gr;
  scanf("%d %d %d",&n,&m,&p);
  int gcd= great(m,n,p);
  printf("%d",gcd);
}
int great(int n1,int n2,int n3)
{
  int s;
  if(n1>n2 && n1>n3)
    s=n1;
  else if(n2>n3)
  {s=n2;
  }
  else
  { s=n3;
  }
   
   return s;   
}