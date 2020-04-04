class Print1{
public static void main(String args[])
{Print1 ob=new Print1();
ob.get();
}
public void get()
{
this.set();
}
public void set()
{
System.out.println("set method");
}
}