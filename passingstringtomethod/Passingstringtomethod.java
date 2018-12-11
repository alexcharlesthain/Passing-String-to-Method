package passingstringtomethod;

public class Passingstringtomethod {
	public static void main(String[] args) {
		String str = "Hello World";
		System.out.println("In main: Before Passing String " +
			"to method: " + str);
		method(str);
		System.out.println("In main: After returning " +
			"from method: " + str);
	
	}
	public static void method(String strTest) {
	strTest += " World";
	System.out.println("In method(): " + strTest);
	
	}
}
