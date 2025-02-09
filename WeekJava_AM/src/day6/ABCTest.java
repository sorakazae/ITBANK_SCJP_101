package day6;
class A{
	A(){
		super();
		System.out.println("A 클래스의 생성자 호출");
	}
}
class B extends A{
	B(int num){
		super();
		System.out.println("B 클래스의 생정자 호출");
	}
}
class C extends B{
	C(){
		super(100);
		System.out.println("C 클래스의 생성자 호출");
	}
}
public class ABCTest {

	public static void main(String[] args) {
		new C();

	}

}
