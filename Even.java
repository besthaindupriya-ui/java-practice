import java.util.*;
class Even 
{
	public static void main(String[] args) 
	{
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    if(x%2==0)
		System.out.println(x+" is Even Number");
    else
        System.out.println(x+" is Odd Number");
	}
}
