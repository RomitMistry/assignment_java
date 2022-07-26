package constructer;

class Employee{
	int id;
	String name;
	Employee()
	{
		System.out.println("this is default constructor");
	}
	Employee(int id,String name)
	{
		this.id = id;
		this.name=name;
		System.out.println("id = "+id+" name = "+name);
	}
	Employee(Employee e1)
	{
		id = e1.id;
		name = e1.name;
	}
	
	Employee(int name1)
	{
		System.out.println("69");
	}
	public void run() {
		System.out.println("id = "+id+" name = "+name);
	
}

}
public class Data {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.run();
		Employee e1 = new Employee(3,"java");
		e1.run();
		Employee e2 = new Employee(e1);
		e2.run();
		Employee e3 = new Employee(e1);
		e3.run();
		Employee e4 = new Employee(int name1);
		e4.run();
	}

}
