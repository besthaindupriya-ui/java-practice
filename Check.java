import java.util.*;
class Check
{
	public static void main(String[] args) 
	{
     Scanner sc=new Scanner(System.in);
     int x=sc.nextInt();
     if(x>0)
		System.out.println(x+" is Positive");
     else if(x<0)
        System.out.println(x+" is Negative");
     else
        System.out.println(x+" is Zero");
	}
}
