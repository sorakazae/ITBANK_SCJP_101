package day4;

public class ClassLoadingTest {

	public static void main(String[] args) throws Exception{
		System.out.println("ClssLoadingTest 클래스의 main() 메서드 수행 시작!!");
		Thread.sleep(10000);
		Student obj1 = new Student();
		System.out.println("Student 객체 생성 완료");
		obj1.name = "윤아";
		obj1.age = 10;
		System.out.println(obj1.getInfo());
		Thread.sleep(5000);
		Student obj2 = new Student();
		System.out.println("Student 객체 생성 완료");
		obj2.name = "태연";
		obj2.age = 11;
		System.out.println(obj2.getInfo());
		System.out.println("ClassLoadingTest 클래스의 main() 메서드 수행 종료!!");

	}

}
