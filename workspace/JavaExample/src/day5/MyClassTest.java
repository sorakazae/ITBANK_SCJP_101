package day5;
import java.util.Date;
class MyClass extends Object{   // �θ�class �������� ������ Object�� �θ� �� /�ᱹ�� Object�� �ڼ��� ��
	@Override     // �ش��ϴ� �޼��� �ٷ� ���� ��� ��
	public String toString(){          // �������̵�
		return "MyClass �� ��ü�Դϴ�.";
	}
}
class OtherClass {

	@Override  // JDK 1.5 ���� �߰��� ������̼� ����  // �����Ϸ����� �˸��� ��
	public String toString() {
		return "OtherClass []";
	}   // �������̵��� ���� �ʾƼ�  Object�� ��ӵ�
	
	
}
public class MyClassTest {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		System.out.println(obj.toString());   // ��ü�� ������ �ϳ��� ���ڿ��� return�Ѵ�.
		OtherClass obj2 = new OtherClass();
		System.out.println(obj2.toString());   // java.lang�� ��Ű��
		Date d = new Date();    // ��Ű���� �ٸ��� ��Ű�� ���� ���� ��� ��
		System.out.println(d.toString());

	}

}
