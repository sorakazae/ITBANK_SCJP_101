package day7;

public class InterfaceTest {

	public static void main(String[] args) {
		A a = new A();
		a.autoPlay(new B());
		a.autoPlay(new C());
		a.autoPlay(new D());

	}

}
interface I{
	public abstract void play();
}
class A{
	void autoPlay(I i){
		i.play();
	}
}
class B implements I{
	public void play(){
		System.out.println("play in B class");
	}
}
class C implements I{
	public void play(){  // ���������� ũ�Ⱑ ����?���� �� ���� ���� ����.
		System.out.println("play in C class");
	}
}
class D implements I{
	public void play(){
		System.out.println("play in D class");
	}
}