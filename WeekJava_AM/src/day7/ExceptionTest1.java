package day7;

public class ExceptionTest1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main() ���� ����");  // ^����ó�� ����^
		Thread.sleep(5000);  //����ó���� �ؾ� ȣ���� �� �ִµ�...
		System.out.println("main() ���� ����");

	}

}
