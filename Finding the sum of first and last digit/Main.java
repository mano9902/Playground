#include <stdio.h>
int main() {
	int n,a;
  scanf("%d",&n);
  a=n;
  while(n>10)
  {
    n=n/10;
    a=a%10;
  }
  printf("%d",n+a);
	return 0;
}