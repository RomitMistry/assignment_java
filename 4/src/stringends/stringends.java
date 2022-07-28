package stringends;

public class stringends {
	public static void main(String[] args) {
		String str = "Java Exercises";
		String str2 = "Java Exercise";
		String end_str ="se";
		System.out.println( "java exercises ends with se?::"+str.endsWith(end_str));
		System.out.println("java exercise ends with se?::"+str2.endsWith(end_str));
	}
}
