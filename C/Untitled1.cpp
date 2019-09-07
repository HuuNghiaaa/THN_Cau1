#include <stdio.h>
typedef struct PS
{
	int ts;
	int ms;	
};
void nhapPS(PS &p)
{
	
	printf("Nhap tu so\n");
	scanf("%d",&p.ts);
	
	printf("Nhap mau so\n");
	scanf("%d",&p.ms);
	
}
int main()
{
	
	
	PS p;
	nhapPS(p);
	printf("%d%d",&p.ts, p.ms);
	return 0;
	
}