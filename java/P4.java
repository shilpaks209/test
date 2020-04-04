class P4{
int i;
public static void main(String args[])
{
P4 ob=new P4();
}
public P4()
{
this(136);
System.out.println(i);
}
public P4(int a)
{int sum=0;
while(a>0)
{int r=a%10;
sum=sum*10+r;
a=a/10;
}
i=sum;
}}
