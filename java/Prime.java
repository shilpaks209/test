class Prime{
public static void main(String args[])
{
int n=81;
int flag=0;
for(int i=2;i<=n/2;i++)
{int r=n%i;
if(r==0)
{flag=1;
break;}}

if(flag==1)
{
System.out.println("the number is not prime");
}
else
{System.out.println("the number is prime");}
}}