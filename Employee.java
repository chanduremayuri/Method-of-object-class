import java.util.*;
class Emp 
{
	String name ;
	String company;
	String location ;

	Emp(String name ,String company,String location )
	 {
	 this.name = name ;
	 this.company = company;
	 this.location = location;
	}

 protected void finalize() throws Throwable
 {
 	try {
 		System.out.println("OBJ DESTRIOID ");
     }
    
     finally {
     super.finalize();
     }


 }
}

class Employee
{
	public static void main(String[] args) 
	{
		Emp obj = new Emp("Mayu","TCS","Pune");
		System.out.println(obj);

		
		obj = null;
		System.gc();
		//System.out.println(obj.name);
		System.out.println(obj); 
	}
}