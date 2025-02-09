package day7;

public class PolyTest {

	public static void main(String[] args) {
		printObjectInfo(new Object());
		printObjectInfo(new String("가나다"));
		printObjectInfo("ABC");
		printObjectInfo(new java.util.Date());
		printObjectInfo(new java.io.File("c:/"));
		printObjectInfo(new int[10]);
		printObjectInfo(new double[10]);
		printObjectInfo(new day4.Member());
	}
	static void printObjectInfo(Object o){       // Object의 객체,자손만 와라(Object의 자손이 아닌 것은 없다)
		if ( o instanceof String){  // o에 전달된 객체의 타입이 String인가? 왼쪽에 참조형 변수명 ,오른쪽에 클래스명 타입
			System.out.print("String 객체 전달 : "+o.toString());
			System.out.println("전달된 문자열의 길이 : "+((String)o).length());
		}else {							    //^자손형으로 강제 형변환
		System.out.println("전달된 객체의 클래스 명 : "+o.getClass().getName());
		}
	}
}
