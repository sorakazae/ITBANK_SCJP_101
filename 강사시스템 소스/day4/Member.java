package day4;
public class Member {
	String id;
	String pwd;
	String name;		
	public Member() {			
		this("guest", "guest", "�մ�");
		System.out.println("����");
	}	
	public Member(String id, String p, String n) {
		 super();
		 this.id = id;
		 pwd = p;
		 name = n;
	}
	public String getMemberInfo() {
	   return "[����:"+id+",��ȣ:"+pwd+",�̸�:"+name+"]";
	}
}