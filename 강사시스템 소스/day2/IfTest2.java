package day2;

public class IfTest2 {
	public static void main(String[] args) {
		// 1-12 ������ ������ ���ؼ�
		// 12 �Ǵ� 1 �Ǵ� 2 �� ����Ǹ� "XX ���� �ܿ� �Դϴ�." �� ���
		// 3 �Ǵ� 4 �Ǵ� 5 �� ����Ǹ� "XX ���� �� �Դϴ�." �� ���
		// 6 �Ǵ� 7 �Ǵ� 8 �� ����Ǹ� "XX ���� ���� �Դϴ�." �� ���
		// 9 �Ǵ� 10 �Ǵ� 11 �� ����Ǹ� "XX ���� ���� �Դϴ�." �� ���
		
		int month = (int)(Math.random() * 12) + 1;
		System.out.print(month + "���� ");
		if(month == 12 || month == 1 || month == 2) {
			System.out.print("�ܿ�");
		} else if(month == 3 || month == 4 || month == 5) {
			System.out.print("��");
		} else if(month == 6 || month == 7 || month == 8) {
			System.out.print("����");
		} else {
			System.out.print("����");
		}
		System.out.print("�Դϴ�.");
	}
}









