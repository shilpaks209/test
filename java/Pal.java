class Pal{
public static void main(String args[])
{int a=153;
int j=Pal.reverse(a);
System.out.println("the reverse of the number is"+j);
}
public static int reverse(int i)
{
int sum=0;
while(i>0)
{
int r=i%10;
sum=sum*10+r;
i=i/10;
}
return(sum);
}}