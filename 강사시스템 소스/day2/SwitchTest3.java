package day2;

public class SwitchTest3 {
	public static void main(String[] args) {
		int score = (int)(Math.random()*101);
		// score ������ ���� 90-100 �̸� "A(����)" 
		// score ������ ���� 80-89 �̸� "B(����)" 
		// score ������ ���� 70-79 �̸� "C(����)" 
		// score ������ ���� 60-69 �̸� "D(����)" 
		// score ������ ���� 59 �����̸� "F(����)" 	
		// switch ������ �����մϴ�.		
		switch(score/10){
		case 10:
		case 9:
			System.out.println("A("+score+")");
			break;
		case 8:
			System.out.println("B("+score+")");
			break;
		case 7:
			System.out.println("C("+score+")");
			break;
		case 6:
			System.out.println("D("+score+")");
			break;
		default:
			System.out.println("F("+score+")");		
	    }
	}
}
