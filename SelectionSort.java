import java.util.*;
class SelectionSort 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int temp=0;
	int minindex=-1;
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Before sorting : ");
	for(int i=0;i<n;i++)
	{
		System.out.print(a[i]+" ");
	}
	for(int i=0;i<a.length;i++)
	{
		minindex=i;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[minindex] > a[j])
			{
				minindex=j;
			}
		}
		temp=a[minindex];
		a[minindex]=a[i];
		a[i]=temp;
	}	
	System.out.println();
	System.out.println("After sorting : ");
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
}
}