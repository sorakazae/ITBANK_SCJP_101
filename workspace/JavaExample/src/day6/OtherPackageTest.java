package day6;
import day4.Member;  // Member class �� public �ٿ��� ���� �����ϰ� ����� �ȴ�.
public class OtherPackageTest {

	public static void main(String[] args) {
		Member obj = new Member("javatest", "999", "���ӽ�����");
		System.out.println(obj.getMemberInfo());

	}

}
