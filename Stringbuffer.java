import java.util.*;
class Stringbuffer
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	StringBuffer sb=new StringBuffer(s);
		System.out.println(sb);
	System.out.println(sb.append(" priya"));
	System.out.println(sb.insert(4," loves"));
	System.out.println(sb.deleteCharAt(3));

	}
}
