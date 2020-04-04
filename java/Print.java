class Print{
String name;
public static void main(String args[])
{
Print ob=new Print("abc");
ob.display();
}
public Print(String name)
{
this.name=name;
}
public void display()
{System.out.print(name);
}
}