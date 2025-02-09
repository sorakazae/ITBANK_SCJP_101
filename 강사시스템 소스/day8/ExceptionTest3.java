package day8;
class TestException extends Exception {
	TestException(String message){
		super(message);
	}
}
public class ExceptionTest3 {
	public static void main(String[] args) {
		System.out.println("main()수행시작");
		a();
		System.out.println("main()수행종료");
	}
	static void a() {
		System.out.println("a()수행시작");
		try {
			b();
		} catch (TestException e){
			System.out.println("==================");
			System.out.println(e.getMessage());
			System.out.println("==================");
			e.printStackTrace();
		}
		System.out.println("a()수행종료");
	}
	static void b() throws TestException {
		System.out.println("b()수행시작");
		c();
		System.out.println("b()수행종료");
	}
	static void c() throws TestException {
		System.out.println("c()수행시작");
		int num = (int)(Math.random()*2);
		if(num == 1){
			throw new TestException(":::테스트로 예외발생시킴:::");
		}else {
			System.out.println("ㅋㅋㅋㅋ");
		}	
		System.out.println("c()수행종료");
	}	
}



