class Student22 
{
	String sname;
	String place ;
	String branch;
	int yop;

	Student22(String sname,String place ,String branch,int yop)
	{
this.sname= sname;
this.place =place;
this.branch = branch;
this.yop =yop;
	}
	public boolean equals(Object obj)
	{
		Student22 obj2 = (Student22)obj;
		if((this.sname ==obj2.sname) && (this.place ==obj2.place) && (this.branch ==obj2.branch) && (this.yop ==obj2.yop))
			return true;
		else
			return false ;
	}
	
}

class  Student
{
	public static void main(String[] args) 
	{
   Student22 obj1 = new Student22("Mayu","Pune","ENTC", 2024);
   Student22 obj2 = new Student22("Mayuri","Panjab","ENTC", 2024);
		System.out.println(obj1.equals(obj2));
	}
}