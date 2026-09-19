class Calculator
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
}
class AdvCalc extends Calculator
{
	public int mult(int a,int b)
	{
		return a*b;
	}
	public int div(int a,int b)
	{
		return a/b;
	}
}
class VeryAdvCalc extends AdvCalc
{
	public double pow(int a,int b)
	{
		return Math.pow(a,b);
	}
	public int mod(int a,int b)
	{
		return a%b;
	}
}
class MultiLevelInheritance
{
	public static void main(String args[])
	{
	VeryAdvCalc obj=new VeryAdvCalc();
	int r1=obj.add(10,20);
	int r2=obj.sub(40,20);
	int r3=obj.mult(40,40);
	int r4=obj.div(100,10);
	double r5=obj.pow(20,2);
	int r6=obj.mod(46,3);
	System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5+" "+r6);
}
}