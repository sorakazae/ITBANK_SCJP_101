public class FirstApp {
	public static void main(String args[]) {
		System.out.println("안녕? 자바!");
		System.out.println("현재 시간 : " + 
		                            new java.util.Date().toString());
		System.out.println(100+200);     // 300
		System.out.println("100"+200);  //  100200
		System.out.println(100 < 200);   // true
	}
}
