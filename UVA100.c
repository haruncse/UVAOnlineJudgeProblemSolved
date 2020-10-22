#include<stdio.h>
int main()
{
unsigned long int i,j,n=0,l=0,m=0,c=0,max=0;

while(scanf("%lu %lu",&i,&j)==2)
{
if(i<j)
{
l=i;
m=j;}
else
{l=j;
m=i;}
for(i=l;i<=m;i++)
{n=i;
while(n!=1)
{
if(n%2!=0)
{n=(3*n)+1;
c++;}
else
{n=n/2;
c++;}
}c++;
if(c>max)
max=c;
c=0;}
printf("%lu %lu %lu\n",l,m,max);
max=0;l=0;m=0;}

return 0;
}
