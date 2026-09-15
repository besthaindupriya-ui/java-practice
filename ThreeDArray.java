import java.util.*;
class ThreeDArray
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int k=sc.nextInt();
	int l=sc.nextInt();
	int m=sc.nextInt();
	int a[][][]=new int[k][l][m];
	for(int i=0;i<k;i++)
	{
		for(int j=0;j<l;j++)
			{
				for(int h=0;h<m;h++)
				{
					a[i][j][h]=sc.nextInt();
			}
			}
	}
	for(int i=0;i<k;i++)
	{	
		for(int j=0;j<l;j++)
		{	
			for(int h=0;h<m;h++)
			{
				System.out.print(a[i][j][h]+"  ");
			}
			System.out.println();
		}
	}
}
}
