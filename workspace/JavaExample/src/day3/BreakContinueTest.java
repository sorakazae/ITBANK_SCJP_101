package day3;

public class BreakContinueTest {

	public static void main(String[] args) {
		// int dan = (int)(Math.random()*9)+1;
		a: for (int dan = 1; dan <= 9; dan++) {     // a��� ���� ��
			System.out.print(dan + "��:");
			for (int i = 1; i < 10; i++){
				/*if(dan*i%2==1)
					continue;*/
				if(dan*i>30)
					break a;  // a��� ���� �پ��ִ� �ݺ����� ����(�ۿ� �ݺ����� ������ ���
				System.out.print("\t" + dan + "x" + i + "=" + dan * i);
			}
			System.out.println();
		}

	}

}
