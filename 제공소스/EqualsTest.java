package day8;

public class EqualsTest {
	public static void main(String[] args) {
		String s1 = "������";
		String s2 = "������";
		String s3 = new String("������");
		
		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // false
		
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3)); // true
	}
}
