package day2;

public class WhileTest2 {

	final static int LOTTO_NUM = 3;

	public static void main(String[] args) {
		System.out.println("main() ���� ����");
		while (true) {
			int num = (int) (Math.random() * 5) + 1;
			System.out.println("����� ���� : " + num);
			if (num == LOTTO_NUM) {
				System.out.println("��÷!!!");
				break;
			}
		}
		System.out.println("main() ���� ����");
	}
}