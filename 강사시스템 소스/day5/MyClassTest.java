package day5;
import java.util.Date;
class MyClass extends Object{	
	@Override
	public String toString() {
		return "MyClass �� ��ü�Դϴ�..";
	}
}
class OtherClass {
	@Override  // JDK 1.5 ���� ������̼� ����
	public String toString() {
		return "OtherClass []";
	}		
}
public class MyClassTest {
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		System.out.println(obj.toString());
		OtherClass obj2 = new OtherClass();
		System.out.println(obj2.toString());
		Date d = new Date();
		System.out.println(d.toString());
	}
}
