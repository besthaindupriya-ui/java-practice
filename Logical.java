class Logical
{
	public static void main(String[] args) 
	{
     int x=10;
     int y=20;
     int a=40;
     int b=80;
		System.out.println(x<y || a<b);
		System.out.println(x>y || a<b);
		System.out.println(x<y && a<b);
		System.out.println(x>y && a<b);
       boolean result=(x<y || a<b);
		System.out.println(!result);
	}
}
