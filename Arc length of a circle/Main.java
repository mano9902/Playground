#include<stdio.h>
int main()
{
  float rad,ang;
  float arc;
  scanf("%f %f",&rad,&ang);
  arc= (ang*2*3.14*rad)/360;
  printf("%.2f",arc);
  return 0;
}
