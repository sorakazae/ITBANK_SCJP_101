package day1;

public class TypeTest2 {

	public static void main(String[] args) {
		int name=100;  // 자바는 쓰레기 값(변수 초기화를 하지 않는것)을 허용하지 않는다.
		//name=100;  // 변수 초기화  
		System.out.println(name);     // ()가 없으면 변수로 인식하고  있으면 메서드로 인식
		name=200;          // 리터럴
		System.out.println(name);
		//200=name;    // 리터럴은 왼쪽에 올 수 없다.
		name = 10+20;       // 연산식
		System.out.println(name);
		name = "가나다".length();
		System.out.println(name);
	}

}
