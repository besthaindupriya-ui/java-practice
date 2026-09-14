//Object and Class Creation
import java.util.*;
class Calculator
{
public int add(int num1,int num2){
    int r=num1+num2;
    return r;
}
	public static void main(String[] args) 
	{
    Scanner sc=new Scanner(System.in);
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    Calculator c=new Calculator();
    int result=c.add(num1,num2);
	System.out.println(result);
	}
}
