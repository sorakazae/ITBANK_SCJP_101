package day6;
import day4.Member;
public class OtherPackageTest {
	public static void main(String[] args) {
		Member obj = new Member("javatest", "999", "제임스고슬링");
		System.out.println(obj.getMemberInfo());
	}

}
