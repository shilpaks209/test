class Pri{
public static void main(String args[])
int c=3;
int n=1;
System.out.println(n);
for(int i=2;i<=10;i++;)
{for(int j=2;j<=c-1;j++)
	int r=i%j;
if(r==0)
{
	break;
}
if (j==c)
{
System.out.println(c);
}
c++;}
}