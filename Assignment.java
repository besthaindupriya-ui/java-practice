class Assignment
{
	public static void main(String[] args) 
	{
     int a=100;
		System.out.println(a);  //100
		System.out.println(a+=20);   //120
		System.out.println(a-=30);   //90
		System.out.println(a*=5);    //450
		System.out.println(a/=4);    //112
		System.out.println(a%=3);    //1
	}
}
// it performs operation of next one for the previously done operation value stored in a 
// means after add a=120 then next subtracting we required 70 but it prints 90(120-30).
