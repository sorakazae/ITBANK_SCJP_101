package day2;

public class SwitchTest3 {
	public static void main(String[] args) {
		int score = (int)(Math.random()*101);
		// score 변수의 값이 90-100 이면 "A(점수)" 
		// score 변수의 값이 80-89 이면 "B(점수)" 
		// score 변수의 값이 70-79 이면 "C(점수)" 
		// score 변수의 값이 60-69 이면 "D(점수)" 
		// score 변수의 값이 59 이하이면 "F(점수)" 	
		// switch 문으로 구현합니다.		
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
