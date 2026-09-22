class A
{
public A()
{
super();
System.out.println("This is A");
}
}
class B extends A
{
public B(){
super();
System.out.println("This is B");               //SUPER method can access the Parent class
}
public B(int a){
super();
System.out.println("This is B with arg");
}
}
class Super
{
	public static void main(String[] args) 
	{
	B obj=new B();
	B obj2=new B(5);
	}
}
