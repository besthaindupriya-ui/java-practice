class Type 
{
	public static void main(String[] args) 
	{
    float f=129.5f;
    int x=(int)f;
    byte b=(byte)x;
byte by=126;
int a=by;      //type conversion
int k=257;
byte l=(byte)k;    //type casting
		System.out.println(x);
		System.out.println(b);
		System.out.println(a);
		System.out.println(l);
	}
}
/*
byte -> short -> int -> long -> float -> double
---> type conversion
type casting  <-----
*/