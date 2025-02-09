package day2;

public class SwitchTest3 {

	public static void main(String[] args) {
		// score 변수의 값이 90~100 이면 "A(점수)"
		// score 변수의 값이 80~89 이면 "B(점수)"
		// score 변수의 값이 70~79 이면 "C(점수)"
		// score 변수의 값이 60~69 이면 "D(점수)"
		// score 변수의 값이 59 이하이면 "F(점수)"
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
			



