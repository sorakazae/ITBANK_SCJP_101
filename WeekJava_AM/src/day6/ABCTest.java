package day6;
class A{
	A(){
		super();
		System.out.println("A Ŭ������ ������ ȣ��");
	}
}
class B extends A{
	B(int num){
		super();
		System.out.println("B Ŭ������ ������ ȣ��");
	}
}
class C extends B{
	C(){
		super(100);
		System.out.println("C Ŭ������ ������ ȣ��");
	}
}
public class ABCTest {

	public static void main(String[] args) {
		new C();

	}

}
