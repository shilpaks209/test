class Pal2{
	int a;
public static void main(String args[])
{
int num=153;
Pal2 ob1=new Pal2(num);
int n=ob1.reverse(num);
System.out.println("reverse of the number is"+n);
}
public int reverse(int i)
{
int sum=0;
while(i>0)
{int r=i%10;
sum=sum*10+r;
i=i/10;
}
int a=sum;
return(sum);
}
public Pal2(int b)
{
if(a==b)
{System.out.println("reverse of the number is palindrome");}
else
{System.out.println("reverse of the number isnot palindrome");}
}}