import java.util.*;
class JaggedArray
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[][]=new int[n][];   //jagged array
	for(int i=0;i<n;i++)
	{
		int m=sc.nextInt();
		a[i]=new int[m];
		for(int j=0;j<m;j++)
		{
			a[i][j]=sc.nextInt();
	}
}
	for(int i=0;i<a.length;i++)
	{	
		for(int j=0;j<a[i].length;j++)
		{	
			System.out.print((a[i][j])+"  ");
		}
		System.out.println();
	}
}
}
