package printsalary;

class Member{
    String Name;
    int Age;
    int number;
    String Address;
    int Salary;
    public void printSalary(){
        System.out.println(Salary);
    }
}
class Employee extends Member{
    String Specialization;
}
class Manager extends Member{
    String Department;
}

 class Printsalary {
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.Name = "Romit";
		e.Age=19;
		e.Address="Ahmedabad";
		e.number=83439422;
		e.Salary=100000;
		e.Specialization="reading";
		
		System.out.println("DETAILS OF Employee ::-");
		System.out.println("Name of the Employee::"+e.Name);
		System.out.println("Age of the Employee::"+e.Age);
		System.out.println("Address of the Employee::"+e.Address);
		System.out.println("Number of the Employee::"+e.number);
		System.out.println("Salary of the Employee::"+e.Salary);
		System.out.println("Specialization of the Employee::"+e.Specialization);
		
		
		Manager m = new Manager();
		m.Name="xyz";
		m.Age=34;
		m.Address="Ahmedabad";
		m.number=342342342;
		m.Salary=1000000;
		m.Department="HR";
		
		System.out.println("DETAILS OF MANAGER ::-");
		System.out.println("Name of the Manager::"+m.Name);
		System.out.println("Age of the Manager::"+m.Age);
		System.out.println("Address of the Manager::"+m.Address);
		System.out.println("Number of the Manager::"+m.number);
		System.out.println("Salary of the Manager::"+m.Salary);
		System.out.println("Department of the Manager::"+m.Department);
		
		
	}

}

