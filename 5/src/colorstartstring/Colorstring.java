package colorstartstring;

public class Colorstring {
	public static void main(String[] args) {
		String str ="Red is my favorite colour";
		String str2 = "Orange is my favorite colour";
		String starts = "Red";
		System.out.println("red is my favorite colour::"+str.startsWith(starts));
		System.out.println("orange is my favorite colour::"+str2.startsWith(starts));
	}

}
