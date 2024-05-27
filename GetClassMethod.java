import java.util.*;
class Student
{
	String name;
	String branch;
	String place ;

	 Student(String name,String branch,String place )
	 {
	 	this.name = name;
	 	this.place = place;
	 	this.branch = branch;
	 }
}
class GetClassMethod
{
public static void main(String[] args) 
{
	Student obj1 = new Student("mayu","pune", "ENTC");
	System.out.println(obj1.getClass());

	String str = new String();
	System.out.println(str.getClass());

	LinkedList ll = new LinkedList();
	System.out.println(ll.getClass());
}
}
