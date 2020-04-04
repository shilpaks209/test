class Print3{
int g;

public static void main(String args[])
{Print3 ob=new Print3();
}
public Print3()
{
this(132);
System.out.println("reverse of number="+g);
}

public Print3(int b)
{int sum=0;
while(b>0)
{
int r=b%10;
sum=sum*10+r;
b=b/10;
}
g=sum;}
}

