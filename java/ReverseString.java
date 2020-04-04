public class ReverseString{
public static void main(String args[]){
		String n="hello";
		String b="   ";
		int i=n.length();
		for(int j=i-1 ;j>=0;j--){
	b=b+n.charAt(j);
		
		}
		System.out.print(b);
		}
		}
