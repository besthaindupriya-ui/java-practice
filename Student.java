class Student
{
int rollno;
String name;
int marks;

	public static void main(String[] args) 
	{
     Student s1=new Student();
	 s1.name="indu";
	 s1.rollno=589;
	 s1.marks=90;
	 Student s2=new Student();
	 s2.name="Prakash";
	 s2.rollno=590;
	 s2.marks=85;
	 Student s3=new Student();
	 s3.name="Ramesh";
	 s3.rollno=591;
	 s3.marks=87;

	 Student students[]=new Student[3];
	 students[0]=s1;
	 students[1]=s2;
	 students[2]=s3;
	 for(int i=0;i<students.length;i++){
System.out.println(students[i].rollno+" "+students[i].name+" : "+students[i].marks);
	}
}
}
