package day4;

public class Member {
	String id;
	String pwd;
	String name;
	
	public Member(){        // ������
		this("guest","guest","�մ�");  // ������ �ȿ����� ����        ù��° ���๮�忡����
		/*id = "guest";
		pwd = "guest";
		name = "�մ�";*/
	}
	public Member(String i, String p, String n){  // ������
		super();
		this.id=i;
		pwd=p;
		name=n;   // �ν��Ͻ� �ʱ�ȭ
	}
	
	public String getMemberInfo(){
		return "[����:"+id+", ��ȣ:"+pwd+", �̸�:"+name+"]";
	}
}