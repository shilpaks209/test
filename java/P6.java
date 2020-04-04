class P6{
public static void main(String args[])
{
int n=1698;
int a[]={1,0,0,0,0,0,1,0,2,1};
int count=0;
while(n>0)
{int r=n%10;
count=count+a[r];
n=n/10;
}
System.out.println(count);
}
}