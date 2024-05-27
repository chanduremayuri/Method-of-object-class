class Student 
{
    String name;
	String branch;
	Student(String name,String branch )
	 {
	 	this.name = name;
        this.branch = branch;
	 }
	 public String toString()
	 {
	 	return "Hi my name is "+ this.name + " and I have completed my "+this.branch + "  Engineering";
	 }
}
class ToStringMethodEg 
{
	public static void main(String[] args) 
	{
		Student obj = new Student("Mayuri","ENTC");
		System.out.println(obj);
	}
}