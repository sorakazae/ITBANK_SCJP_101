package day4;

public class Member {
	String id;
	String pwd;
	String name;
	
	public Member(){        // 생성자
		this("guest","guest","손님");  // 생성자 안에서만 가능        첫번째 수행문장에서만
		/*id = "guest";
		pwd = "guest";
		name = "손님";*/
	}
	public Member(String i, String p, String n){  // 생성자
		super();
		this.id=i;
		pwd=p;
		name=n;   // 인스턴스 초기화
	}
	
	public String getMemberInfo(){
		return "[계정:"+id+", 암호:"+pwd+", 이름:"+name+"]";
	}
}