class A
{
public A()
{
System.out.println("This is A ");
}
public A(int m)
{
System.out.println("This is A with arg ");
}
}
class B extends A
{
public B()
{
super();
System.out.println("This is B");
}
public B(int n)
{
this();
System.out.println("This is B with Arg");
}
}
class ThisMethod
{
public static void main(String args[])
{
	A obj1=new A(9);
	B obj=new B(4);
}
}