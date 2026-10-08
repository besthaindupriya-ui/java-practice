import java.util.*;
class InsertionSort
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
		a[i]=sc.nextInt();
		}
		System.out.println("Before Sorted Array");
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}
		for(int i=1;i<a.length;i++)
		{
			int key=a[i];
			int j=i-1;
				while(j>=0 && a[j]>key)
				{
					a[j+1]=a[j];
					j--;
				}
				a[j+1]=key;
		}
		System.out.println();
		System.out.println("After Inserting Sorted Array");
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}
	}
}
