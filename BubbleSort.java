import java.util.*;
class BubbleSort 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int temp=0;
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
		for(int j=0;j<a.length-1;j++)
		{
		if(a[j] > a[j+1])
		{
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		}		
	}
	}
	System.out.println();
	System.out.println("After sorting : ");
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
}
}