package day6;
import day4.Member;  // Member class 에 public 붙여서 접근 가능하게 만들면 된다.
public class OtherPackageTest {

	public static void main(String[] args) {
		Member obj = new Member("javatest", "999", "제임스고슬링");
		System.out.println(obj.getMemberInfo());

	}

}
