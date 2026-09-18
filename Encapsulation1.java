class Encapsulation 
{
	private int age;
	private String name;
	public int getAge()
	{
	 return age;
	}
	public void setAge(int a)
	{								//ENCAPSULATION---->Wrapping variables and methods in a single unit(class)
	   age=a;						//	VARIABLES as private
	}								//  METHODS as public
	public String getName()
	{
	 return name;
	}
	public void setName(String n)
	{
	   name=n;
	}
}
 public class Encapsulation1
{
	public static void main(String[] args) 
	{
	Encapsulation obj=new Encapsulation();
	obj.setAge(22);
	obj.setName("RAMESH");
	System.out.println(obj.getName()+" : "+obj.getAge());
	}
}
