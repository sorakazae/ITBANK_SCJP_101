package day2;

public class SwitchTest3 {

	public static void main(String[] args) {
		// score ������ ���� 90~100 �̸� "A(����)"
		// score ������ ���� 80~89 �̸� "B(����)"
		// score ������ ���� 70~79 �̸� "C(����)"
		// score ������ ���� 60~69 �̸� "D(����)"
		// score ������ ���� 59 �����̸� "F(����)"
		int score = (int)(Math.random()*101);
		switch(score/10){
		case 10:
		case 9:
			System.out.print("A");
			break;
		case 8:
			System.out.print("B");
			break;
		case 7:
			System.out.print("C");
			break;
		case 6:
			System.out.print("D");
			break;
		default:
			System.out.print("F");
			
		}
		System.out.print("("+score+")");
	}
}
			



