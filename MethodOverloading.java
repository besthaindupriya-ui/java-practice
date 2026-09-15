class MethodOverloading
{
public int add(int a,int b)
{
return a+b;
}
public int add(int a,int b,int c)
{
return a+b+c;
}
	public static void main(String[] args) 
	{
	MethodOverloading obj=new MethodOverloading();
    System.out.println(obj.add(10,20));
    System.out.println(obj.add(10,20,30));
	}
}
