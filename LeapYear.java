import java.util.*;
class LeapYear 
{
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
if(x%400 == 0 || (x%4 == 0 && x%100 != 0))
	System.out.println(x+" is a Leap Year");
else
    System.out.println(x+" is not a Leap Year");
	}
}
