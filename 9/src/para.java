class  printn{
	int id;
	char name;
	
	void method1(int id,char name) {
		this.id=id;
		this.name=name;
		System.out.println("id = "+id+" char = "+name);
	}
	
	void method2(char name,int id) {
		this.name=name;
		this.id=id;
		System.out.println("char = "+name+" id = "+id);
	}
}
public class para {
	public static void main(String[] args) {
		
		printn p =new printn();
		p.method1(23, 'r');
		p.method2('x', 54);
	}

}
