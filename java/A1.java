class A1{
public static void main(String args[])
{int r=5;
int length=3;
int breadth=4;
int side=6;
A1 ob1=new A1();
float a=ob1.circle(r);
System.out.println("area of the circle="+a);
A1 ob2=new A1();
int b=ob2.rectangle(length,breadth);
System.out.println("area of the rectangle="+b);
A1 ob3=new A1();
int c=ob3.square(side);
System.out.println("area of the square="+c);
}
public float circle(int i) 
{
float area=3.14f*i*i;
return(area);
}
public int rectangle(int p,int q) 
{int area=p*q;
return(area);
}
public int square(int s) 
{int area=s*s;
return(area);
}
}