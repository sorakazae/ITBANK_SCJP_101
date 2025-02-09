
public class FirstApp {          // class의 헤더

	public static void main(String args[]) {  //class의 바디, 메서드의 헤더
		System.out.println("안녕? 자바!");    // 메서드의 바디
		System.out.println("현재 시간:" + 
		new java.util.Date().toString());
		
		System.out.println(100+200);    // 300
		System.out.println("100"+200);  // 100200
		System.out.println(100<200);    // true

	}

}
