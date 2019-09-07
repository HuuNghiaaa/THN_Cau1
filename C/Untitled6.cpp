#include <stdio.h>

typedef struct PS
{
	int ts;
	int ms;
};
void nhapPS(PS &p)
{	

	printf("nhap ts vao\n");
	scanf("%d", &p.ts);
	
	printf("nhap ms vao\n");
	scanf("%d", &p.ms);	
}
void XuatPS(PS p)
{
	printf("%d%d", p.ts, p.ms);	
}
int USCLN(int a, int b)
{
	while(a != b)
	{
		if (a>b)
		a-=b;
		else
		b=-a;
	}
	return a;
}
void RutGon(PS &p)
{
	int us = USCLN(p.ts,p.ms);
	p.ts = p.ts/us;
	p.ms = p.ms/us;
}
void Tong2PS(PS a, PS b)
{
	PS tong;
	tong.ts = a.ts * b.ms + b.ts * a.ms;
	tong.ms = a.ms * b.ms;
	printf("Tong 2PS\n");
	XuatPS(tong);
}

int main()
{
	PS p ;
	nhapPS(p);
	XuatPS(p);
	RutGon(p);
	XuatPS(p);
	
	PS q;
	nhapPS(q);
	XuatPS(q);
	Tong2PS(q,p);
	
	
	
	return 0;
}