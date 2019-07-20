#include<stdio.h>
int main()
{
  int n1,n2,n3;
  scanf("%d %d %d",&n1,&n2,&n3);
  if(n1>n2 && n1>n3)
  {
    if(n2>n3)
    {
      printf("%d",n2);
    }
    else
    {
      printf("%d",n3);
    }
  }
  
  if(n2>n1 && n2>n3)
  {
    if(n1>n3)
    {
      printf("%d",n1);
    }
    else
    {
      printf("%d",n3);
    }
  }
  
  if(n3>n2 && n3>n2)
  {
    if(n2>n1)
    {
      printf("%d",n2);
    }
    else
    {
      printf("%d",n1);
    }
  }
  return 0;
}