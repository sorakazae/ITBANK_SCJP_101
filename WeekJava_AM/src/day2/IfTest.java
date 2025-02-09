package day2;

public class IfTest {

	public static void main(String[] args) {
		int number = (int)(Math.random()*10)+1; //1~10
		
		if(number %2 == 0)   // 수행문이 끝났을 때 ;을 붙인다.
			System.out.println(number + "는 짝수입니다.");
		else  // else는 혼자 사용할 수 없어 '절'이라 한다
			System.out.println(number + "는 홀수입니다.");
	}

}
