#include <stdio.h>
int main()
{
  	long int base,exp;
  long int result=1;
  scanf("%ld %ld",&base,&exp);
  if(exp<0)
    printf("Wrong input");
  else
  {
    while(exp!=0)
    {
      result=result*base;
      --exp;
    }
  printf("%ld",result);
  }
   return 0;
}