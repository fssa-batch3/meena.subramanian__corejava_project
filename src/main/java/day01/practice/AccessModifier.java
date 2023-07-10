package day01.practice;

public class AccessModifier {
	private String a = "a";
	private String b = "b";
	private String c = "c";
	private static String d = "d";

	public static void main(String[] args) {

		AccessModifier am = new AccessModifier();

		System.out.println(am.a);
		System.out.println(am.b);
		System.out.println(am.c);
		System.out.println(am.d);

	}
}
