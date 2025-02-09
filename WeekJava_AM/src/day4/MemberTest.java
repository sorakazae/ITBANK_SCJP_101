package day4;

public class MemberTest {

	public static void main(String[] args) {
		Member obj1 = new Member("java","1234","듀크"); // 생성자를 통해 멤버변수 값 저장
		System.out.println("객체정보: "+obj1.getMemberInfo());
		Member obj2 = new Member();
		System.out.println("객체정보: "+obj2.getMemberInfo());
		

	}

}
