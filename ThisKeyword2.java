class Encapsulation
{
	private int marks;
	private String name;
	public int getMarks()
	{
	return marks;
	}
	public void setMarks(int marks)
	{
	this.marks=marks;
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
public class ThisKeyword2
{
	public static void main(String args[])
{
	Encapsulation obj=new Encapsulation();
	obj.setMarks(99);
	obj.setName("RAMYA");
	System.out.println(obj.getName()+" : "+obj.getMarks());
}
}