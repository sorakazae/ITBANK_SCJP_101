package day2;

public class IfTest {

	public static void main(String[] args) {
		int number = (int)(Math.random()*10)+1; //1~10
		
		if(number %2 == 0)   // ���๮�� ������ �� ;�� ���δ�.
			System.out.println(number + "�� ¦���Դϴ�.");
		else  // else�� ȥ�� ����� �� ���� '��'�̶� �Ѵ�
			System.out.println(number + "�� Ȧ���Դϴ�.");
	}

}
