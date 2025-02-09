package day5;
class Member {
	String id;
	String pwd;
	String name;
	
	Member(){        // 생성자
		this("guest","guest","손님");  // 생성자 안에서만 가능
		/*id = "guest";
		pwd = "guest";
		name = "손님";*/
	}
	Member(String i, String p, String n){  // 생성자
		// String pwd; 가까이 선언된 것이 우선적으로 사용됨.
		this.id=i;
		pwd=p;
		name=n;   // 인스턴스 초기화
	}
	
	public String getMemberInfo(){
		return "[계정:"+id+", 암호:"+pwd+", 이름:"+name+"]";
	}
}
public class MemberTest {

	public static void main(String[] args) {
		Member obj1 = new Member("java","1234","듀크"); // 생성자를 통해 멤버변수 값 저장
		System.out.println("객체정보: "+obj1.getMemberInfo());
		Member obj2 = new Member();
		System.out.println("객체정보: "+obj2.getMemberInfo());
		

	}

}
