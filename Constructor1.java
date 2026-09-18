class constructor 
{
	private int age;
	private String name;

	public constructor()
	{
		age=20;
		name="INDU";
	}
	public constructor(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	public void show()
	{
		System.out.println("AGE: "+age);
		System.out.println("Name: "+name);
	}
}
public class Constructor1
{
	public static void main(String[] args) 
	{
	constructor obj=new constructor();
	constructor obj1=new constructor(22,"RAMESH");
	obj.show();
	obj1.show();
	}
}
