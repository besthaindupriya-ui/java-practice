class VariablesStatic 
{
	String brand;
	int price;
	static String name;
	void show()
{
	System.out.println("name : "+name+" price : "+price+" brand : "+brand);
}
	public static void main(String[] args) 
	{
    VariablesStatic obj1=new VariablesStatic();
	obj1.brand="Apple";
	obj1.price=200000;
	VariablesStatic.name="SmartPhone";

	VariablesStatic obj2=new VariablesStatic();
	obj2.brand="Samsung";
	obj2.price=100000;
	VariablesStatic.name="SmartPhone";
	
	VariablesStatic.name="Phone";
	obj1.show();
	obj2.show();
	}
}
