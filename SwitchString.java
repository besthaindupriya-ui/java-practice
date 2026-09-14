import java.util.*;
class SwitchString
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
String x=sc.nextLine();
switch(x)
{
case "Sunday":
case "Saturday":                       
		System.out.println("Wake me at 9AM");
        break;
case "Monday":
		System.out.println("Wake me at 6AM");
        break;
default:
        System.out.println("Enter a valid day");
	}
}
}
