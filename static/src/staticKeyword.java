

class staticKeyword{
	static {
		System.out.println("this is a student block");
	}
	int id;
	String name;
	static String cname="tops";
	public staticKeyword(int id,String name) {
		this.id = id;
		this.name = name;
	}
	public void getdata() {
		System.out.println("id : "+id+" name: "+name+" cname : "+cname);
	}
	public static void run() {
		System.out.println("this is run method");
	}
}

public class staticKeyword {
	static {
		System.out.println("this is main static method block");
	}
	
	public static void main(String[] args) {
		staticKeyword s1 = new staticKeyword(1,"romit");
		staticKeyword s2 = new staticKeyword(2,"zankhana");
		s1.getdata();
		s2.getdata();
		
		staticKeyword.run();
	}

}
