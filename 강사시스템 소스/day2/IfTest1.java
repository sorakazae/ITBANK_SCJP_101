package day2;

public class IfTest1 {
	public static void main(String[] args) {
		int number = (int)(Math.random() * 10)+1; // 1-10
		
		if(number % 2 == 0)
			System.out.println(number + "는 짝수입니다.");
		else 
			System.out.println(number + "는 홀수입니다.");
	}
}
