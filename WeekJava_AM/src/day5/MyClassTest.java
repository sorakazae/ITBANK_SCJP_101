package day5;
import java.util.Date;
class MyClass extends Object{   // 부모class 지정하지 않으면 Object이 부모가 됨 /결국엔 Object의 자손이 됨
	@Override     // 해당하는 메서드 바로 위에 써야 함
	public String toString(){          // 오버라이딩
		return "MyClass 의 객체입니다.";
	}
}
class OtherClass {

	@Override  // JDK 1.5 에서 추가된 어노테이션 구문  // 컴파일러에게 알리는 것
	public String toString() {
		return "OtherClass []";
	}   // 오버라이딩을 하지 않아서  Object에 상속됨
	
	
}
public class MyClassTest {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		System.out.println(obj.toString());   // 객체의 정보를 하나의 문자열로 return한다.
		OtherClass obj2 = new OtherClass();
		System.out.println(obj2.toString());   // java.lang의 패키지
		Date d = new Date();    // 패키지가 다르면 패키지 명을 먼저 써야 함
		System.out.println(d.toString());

	}

}
