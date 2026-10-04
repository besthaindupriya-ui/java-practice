import java.util.*;
class LinearSearch 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		int result=LinearSearch(a,target);
		if(result!=-1)
			System.out.println("Element found at index : "+result);
		else
			System.out.println("Element not found");
	}

public static int LinearSearch(int a[],int target)
{
	for(int i=0;i<a.length;i++)
	{
	if(a[i]==target)
		return i;
	}
	return -1;
}
}