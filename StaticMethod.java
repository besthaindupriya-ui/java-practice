class StaticMethod
{
	String brand;
	int price;
	static String name;
	void show()
{
	System.out.println("name : "+name+" price : "+price+" brand : "+brand);
}
	static void show1(StaticMethod obj){
	System.out.println("name : "+name+" price : "+obj.price+" brand : "+obj.brand);
}
	public static void main(String[] args) 
	{
    StaticMethod obj1=new StaticMethod();
	obj1.brand="Apple";
	obj1.price=200000;
	StaticMethod.name="SmartPhone";

	StaticMethod obj2=new StaticMethod();
	obj2.brand="Samsung";
	obj2.price=100000;
	StaticMethod.name="SmartPhone";
	
	
	StaticMethod.show1(obj1);
	StaticMethod.show1(obj2);
}
}
