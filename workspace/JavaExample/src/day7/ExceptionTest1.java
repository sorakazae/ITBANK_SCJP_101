package day7;

public class ExceptionTest1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main() 수행 시작");  // ^예외처리 구문^
		Thread.sleep(5000);  //예외처리를 해야 호출할 수 있는데...
		System.out.println("main() 수행 종료");

	}

}
