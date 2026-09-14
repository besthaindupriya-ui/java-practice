import java.util.*;
class Demo
{
public void music(){
   System.out.println("Music is Playing");
}
public int add(int n,int m){
    int r=n+m;
    return r;
}
public String pen(){
    return "PEN";
}
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
Demo d=new Demo();
d.music();
System.out.println(d.add(n,m));
System.out.println(d.pen());
	}
}
