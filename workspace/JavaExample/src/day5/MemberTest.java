package day5;
class Member {
	String id;
	String pwd;
	String name;
	
	Member(){        // ������
		this("guest","guest","�մ�");  // ������ �ȿ����� ����
		/*id = "guest";
		pwd = "guest";
		name = "�մ�";*/
	}
	Member(String i, String p, String n){  // ������
		// String pwd; ������ ����� ���� �켱������ ����.
		this.id=i;
		pwd=p;
		name=n;   // �ν��Ͻ� �ʱ�ȭ
	}
	
	public String getMemberInfo(){
		return "[����:"+id+", ��ȣ:"+pwd+", �̸�:"+name+"]";
	}
}
public class MemberTest {

	public static void main(String[] args) {
		Member obj1 = new Member("java","1234","��ũ"); // �����ڸ� ���� ������� �� ����
		System.out.println("��ü����: "+obj1.getMemberInfo());
		Member obj2 = new Member();
		System.out.println("��ü����: "+obj2.getMemberInfo());
		

	}

}
