class P3{
int i;
public static void main(String args[])
{P3 ob=new P3();
int r=ob.get(5);
}
public int get(int a)
{this.calculate(a);
System.out.println(i);
return(i);
}
public int calculate(int c)
{int f=1;
for(int j=1;j<=c;j++)
{f=f*j;
}
i=f;
return(f);
}
}