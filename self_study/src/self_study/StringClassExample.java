package self_study;

public class StringClassExample {

	public static void main(String[] args) {
	
		String a = "abc";
		String b = "AbC";
		
		if(a.equals(b)) System.out.println(a + " ve " + b + " icerik ayni.");
		else System.out.println(a + " ve " + b + " icerik farkli.");
		System.out.println("---");
		
		if(a.equalsIgnoreCase(b)) System.out.println(a + " ve " + b + " icerik ayni.");
		else System.out.println(a + " ve " + " icerik farkli.");
		System.out.println("---");
		
		String c = "";
		int var1 = a.compareTo(b);
		int var2 = b.compareTo(c);
		int var3 = c.compareTo(a);
		
		System.out.println(var1 + ", " + var2 + ", " + var3);
	}
}
