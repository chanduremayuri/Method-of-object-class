class Employee
{
	String name;
	int id = 0;
	Employee(String name)
	{
		this.name =name;
		id++ ;
	}
	public int hashCode()
	{
		return id ;
	}
	public String toString()
	{
		return this.id + " ." +this.name ;
	}
}

class HashCodeMethodEg 
{
public static void main(String[] args) 
{
  Employee obj1 = new Employee("Ramesh");
  System.out.println(obj1);
  System.out.println(obj1.hashCode());	

  Employee obj2 = new Employee("Suresh");
  System.out.println(obj2);
  System.out.println(obj2.hashCode());	


}
}