package day2;

public class IfTest3 {

	public static void main(String[] args) {
		// 0부터 100 사이의 난수를 구한다.
		// 100에서~90 사이이면 "xx 점은  A등급입니다."
		// 89에서~80 사이이면 "xx 점은  B등급입니다."
		// 79에서~70 사이이면 "xx 점은  C등급입니다."
		// 69에서~60 사이이면 "xx 점은  D등급입니다."
		// 59에서~0 사이이면 "xx 점은  F등급입니다."
	int jumsu = (int)(Math.random()*100)+1;
	if(jumsu>=90){
		System.out.println(jumsu+"점은 A등급 입니다.");
	}else if(jumsu>=80){
		System.out.println(jumsu+"점은 B등급 입니다.");
	}else if(jumsu>=70){
		System.out.println(jumsu+"점은 C등급 입니다.");
	}else if(jumsu>=60){
		System.out.println(jumsu+"점은 D등급 입니다.");
	}else
		System.out.println(jumsu+"점은 F등급 입니다.");
	}
}
