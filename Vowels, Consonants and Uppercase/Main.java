#include<stdio.h>
#include<string.h>
int main()
{
  char a[10],b[10],c[10];
  int i;
  scanf("%s%s%s",a,b,c);
  for( i=0;a[i]!='\0';i++)
  {
      //char ch=s1[i];
      if((a[i]>='a' && a[i]<='z') || (a[i]>='A' && a[i]<='Z'))
      {
      if(a[i]=='a'||a[i]=='A'||a[i]=='e'||a[i]=='E'||a[i]=='i'||a[i]=='I'||a[i]=='o'||a[i]=='O'||a[i]=='u'||a[i]=='U')
      {
          a[i]='$';
      }
      
      }
      printf("%c",a[i]);
  }
  for( i=0;b[i]!='\0';i++)
  {
      //char ch=s1[i];
      if((b[i]>='a' && b[i]<='z') || (b[i]>='A' && b[i]<='Z'))
      {
      if(b[i]=='a'||b[i]=='A'||b[i]=='e'||b[i]=='E'||b[i]=='i'||b[i]=='I'||b[i]=='o'||b[i]=='O'||b[i]=='u'||b[i]=='U')
      {
          
      }
      else
        b[i]='#';
      
      }
      printf("%c",b[i]);
  }
  for(i=0;c[i]!='\0';i++)
  {
      if(c[i]>='a' && c[i]<='z')
      {
          c[i]=c[i]-32;
      }
      
  }
  printf("%s",c);
}