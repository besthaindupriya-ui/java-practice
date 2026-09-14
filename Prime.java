import java.util.*;
class Prime 
{
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0;
for(int i=2;i<n;i++){
    if(n%i==0){
       count++;
    }
}
if(n <= 1)
{
	System.out.println("Not a Prime");
}
else if(count == 0)
{
    System.out.println("Prime Number "+n);
}
else{
	System.out.println("Not a Prime");
}
}
}
