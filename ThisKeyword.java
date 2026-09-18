class Encapsulation 
{
	private int age;
	private String name;
	public int getAge()
	{
	 return age;
	}
	public void setAge(int age)
	{								
	   this.age=age;					
	}								
	public String getName()
	{
	 return name;
	}
	public void setName(String name)
	{
	   this.name=name;
	}
}
 public class ThisKeyword
{
	public static void main(String[] args) 
	{
	Encapsulation obj=new Encapsulation();
	obj.setAge(22);
	obj.setName("RAMESH");
	System.out.println(obj.getName()+" : "+obj.getAge());
	}
}
