package day4;

public class ClassLoadingTest {

	public static void main(String[] args) throws Exception{
		System.out.println("ClssLoadingTest Ŭ������ main() �޼��� ���� ����!!");
		Thread.sleep(10000);
		Student obj1 = new Student();
		System.out.println("Student ��ü ���� �Ϸ�");
		obj1.name = "����";
		obj1.age = 10;
		System.out.println(obj1.getInfo());
		Thread.sleep(5000);
		Student obj2 = new Student();
		System.out.println("Student ��ü ���� �Ϸ�");
		obj2.name = "�¿�";
		obj2.age = 11;
		System.out.println(obj2.getInfo());
		System.out.println("ClassLoadingTest Ŭ������ main() �޼��� ���� ����!!");

	}

}
