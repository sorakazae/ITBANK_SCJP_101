package day4;
class Student{
	String name;
	int age;
	Student() {
		super();
	}
	public String getInfo() {
		return "�л��̸� : " + name + " ���� : " + age;
	}
	/*@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}*/
	
}
public class StudentTest {
	public  static  void main(String[] args) {
		Student obj1 = new Student();
		obj1.name = "����";
		obj1.age = 10;		
		Student obj2 = new Student();	
		obj2.name = "�¿�";
		obj2.age = 11;
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());	
		System.out.println("obj2=obj1 ���� ������...");
		obj2=obj1;
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());	
	}
}



