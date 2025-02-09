package day2;

public class WhileTest2 {

	final static int LOTTO_NUM = 3;

	public static void main(String[] args) {
		System.out.println("main() 수행 시작");
		while (true) {
			int num = (int) (Math.random() * 5) + 1;
			System.out.println("추출된 숫자 : " + num);
			if (num == LOTTO_NUM) {
				System.out.println("당첨!!!");
				break;
			}
		}
		System.out.println("main() 수행 종료");
	}
}