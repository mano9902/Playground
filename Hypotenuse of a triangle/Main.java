#include<stdio.h>
#include<math.h>
int main()
{
  float a,b,r;
  scanf("%f %f",&a,&b);
  r=sqrt((a*a)+(b*b));
  printf("%.2f",r);
  return 0;
}