import java.util.*;
class BinarySearch 
{
	public static int binarySearch(int a[],int target)
{
	int left=0;
	int right=a.length-1;
	while(left <= right)
	{
	int mid=(left+right)/2;
	for(int i=0;i<a.length;i++)
	{
		if(a[mid] == target)
		{
			return mid;
		}
		else if(a[mid]<target)
		{
			left=mid+1;
		}
		else
		{
			right=mid-1;
		}
	}
	}
		return -1;
}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		int result=binarySearch(a,target);
		if(result!=-1)
			System.out.println("Element found at index : "+result);
		else
			System.out.println("Element not found");
	}
}