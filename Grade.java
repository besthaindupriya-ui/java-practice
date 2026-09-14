import java.util.*;
class Grade 
{
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
if(x==100)
	System.out.println("Grade O");
else if(x>90 && x<100)
    System.out.println("Grade A+");
else if(x>80 && x<90)
    System.out.println("Grade A");
else if(x>70 && x<80)
    System.out.println("Grade B+");
else if(x>60 && x<70)
    System.out.println("Grade B");
else if(x<50)
    System.out.println("Fail");
	}
}
