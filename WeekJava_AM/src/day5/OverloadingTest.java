package day5;

public class OverloadingTest {

	public static void main(String[] args) {
		System.out.println(100);
		System.out.println(3.14);
		System.out.println("��");
		System.out.println("abc");
		System.out.println();
		System.out.println(100 > 50);
		System.out.println(new char[]{'��','��','��'}); // �̹� ����Ǿ� �ִ� �迭�������� �����ϴ� ��� �߰�ȣ�� �� �� ���� �迭 �������� �ٿ��� ��
		System.out.println(new int[]{1,2,3,4,5});  // println�� char���� ������ �ٸ� ���� ���� �ʴ´�.
		System.out.println(new double[]{1,2,3,4,5});

	}

}
