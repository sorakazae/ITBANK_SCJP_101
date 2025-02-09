package day4;
public class Member {
	String id;
	String pwd;
	String name;		
	public Member() {			
		this("guest", "guest", "손님");
		System.out.println("ㅋㅋ");
	}	
	public Member(String id, String p, String n) {
		 super();
		 this.id = id;
		 pwd = p;
		 name = n;
	}
	public String getMemberInfo() {
	   return "[계정:"+id+",암호:"+pwd+",이름:"+name+"]";
	}
}