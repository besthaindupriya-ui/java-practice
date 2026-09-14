import java.util.*;
class Ternary
{
	public static void main(String[] args) 
	{
    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     String result = n%2==0 ? "Even" : "Odd" ;
     int output = n%2==0 ? n : 0;
		System.out.println(result);
        System.out.println(output);
	}
}
