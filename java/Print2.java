class Print2{
	int m;
public static void main(String args[])
{Print2 ob=new Print2();
ob.display(5);
}
public void display(int a)
{this.calculate(a);
System.out.println("factorial="+m);
}
public int calculate(int c)
{
int fact=1;
for(int i=1;i<=5;i++)
{
fact=fact*i;
m=fact;
}
return(fact);
}}