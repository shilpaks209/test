class Mark{
	int tot;
public static void main(String args[])
{
Mark ob1=new Mark(10,20,30);
int i=ob1.s1(10,20,30);
System.out.println(ob1.tot);
Mark ob2=new Mark(95,85,80);
int j=ob2.s2(95,85,80);
System.out.println(ob2.tot);
}
public Mark(int a,int b,int c)
{int total=a+b+c;
tot=total;
System.out.println("total mark of student1="+total);
}
public int s1(int l,int m,int n)
{int p=l+m+n;
	if(l>100)
	{
		System.out.println("grade of student1 is A");
			return(1);
	}
	else{
	System.out.println("grade of student1 B");
	return(1);}
}
public int s2(int l,int m,int n)
{int p=l+m+n;
	if(p>100)
	{
		System.out.println("grade of student1 is A");
			return(1);
	}
	else{
	System.out.println("grade of student1 B");
	return(1);}
}}