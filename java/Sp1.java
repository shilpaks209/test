class Sp1{
public static void main(String args[])
{
Sp1 ob=new Sp1();
}
public Sp1()
{this("shilpa");
System.out.println("default");
}
public Sp1(String n)
{
this(10);
System.out.println(n);
}

public Sp1(int a)
{
System.out.println(+a);
}
}