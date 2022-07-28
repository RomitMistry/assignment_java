package comparestring;

public class comparestring {
	public static void main(String[] args) {
		
		String str1 = "topsint.com";
		String str2 = "topsint.com";
		String str3 = "Topsint.com";
		System.out.println("Comparing "+str1+" and "+str3+": " + str1.contentEquals(str3));
		System.out.println("comparing "+str2+" and "+str1+":" + str2.contentEquals(str1));
	}

}
