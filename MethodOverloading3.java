import java.util.*;
class MethodOverloading3 
{
public void show(int a,double b)
{
System.out.println(a+" "+b);
}
public void show(double a,int b)
{
System.out.println(a+" "+b);
}
	public static void main(String[] args) 
	{
	MethodOverloading3 obj=new MethodOverloading3();
    obj.show(10,20.0);
    obj.show(10.0,20);
	}
}
