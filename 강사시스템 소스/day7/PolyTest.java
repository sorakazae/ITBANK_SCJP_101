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
	static void printObjectInfo(Object o){
		if( o instanceof String ) {
			System.out.print("String 객체 전달 : " + o.toString());
			System.out.println(" 전달된 문자열의 길이 : " + ((String)o).length());
		} else {
			System.out.println("전달된 객체의 클래스 명 : " +
	                                  				o.getClass().getName());
		}
	}
}
