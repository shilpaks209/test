class Int{
public static void main(String args[])
{
int a=Int.add(10,20,30);
System.out.println("average of integers="+a);
float b=Int.add(10.5f,3.8f);
System.out.println("average of float numbers="+b);
}
public static int add(int c,int d,int e)
{
int s=c+d+e;
int avg1=s/3;
return(avg1);

}
public static float add(float p,float r)
{
float sum=p+r;
float avg2=sum/3;
return(avg2);

}
}