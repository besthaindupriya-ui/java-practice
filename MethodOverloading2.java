import java.util.*;
class MethodOverloading2 
{
public int display(int n)
{
return n;
}
public String display(String s)
{
return s;
}
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
sc.nextLine();
String s=sc.nextLine();
	MethodOverloading2 obj=new MethodOverloading2();
    System.out.println(obj.display(n));
    System.out.println(obj.display(s));
	}
}
