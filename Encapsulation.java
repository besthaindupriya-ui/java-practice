class Encapsulation 
{
	private int age;
	private String name;
	public int getAge()
	{
	 return age;
	}
	public void setAge(int a)
	{
	   age=a;
	}
	public String getName()
	{
	 return name;
	}
	public void setName(String n)
	{
	   name=n;
	}
}
 public class Demo1
{
	public static void main(String[] args) 
	{
	Encapsulation obj=new Encapsulation();
	obj.setAge(20);
	obj.setName("INDU");
	System.out.println(obj.getName()+" : "+obj.getAge());
	}
}
