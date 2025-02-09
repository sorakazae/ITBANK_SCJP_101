package day8;

public class EqualsTest {
	public static void main(String[] args) {
		String s1 = "가나다";
		String s2 = "가나다";
		String s3 = new String("가나다");
		
		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // false
		
		System.out.println(s1.equals(s2)); // true  equals 문자열의 내용과 내용을 비교
		System.out.println(s1.equals(s3)); // true
	}
}
