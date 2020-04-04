class Pal1{
public static void main(String args[])
{int a=153;
Pal1 ob1=new Pal1();
int i=ob1.reverse(a);
System.out.println("reverse of the number="+i);
}
public int reverse(int b)
{int sum=0;
while(b>0)
{int r=b%10;
sum=sum*10+r;
b=b/10;
}
return(sum);
}
}
