package day2;

public class IfTest3 {
	public static void main(String[] args) {
		// 0 ���� 100 ������ ������ ���Ѵ�. 
		// 100 - 90 �����̸� "xx ���� A ����Դϴ�."
		// 89 - 80 �����̸� "xx ���� B ����Դϴ�."
		// 79 - 70 �����̸� "xx ���� C ����Դϴ�."
		// 69 - 60 �����̸� "xx ���� D ����Դϴ�."
		// 59 - 0 �����̸� "xx ���� F ����Դϴ�."
		// ��� �����ϸ� �����ϼ���.
		int num = (int)(Math.random()*101);
		if(num >= 90)
			System.out.print(num + "���� A");
		else if(num >=80)
			System.out.print(num + "���� B");
		else if(num >= 70)
			System.out.print(num + "���� C");
		else if(num >= 60)
			System.out.print(num + "���� D");
		else
			System.out.print(num + "���� F");
		System.out.println("����Դϴ�.");
	}
}
