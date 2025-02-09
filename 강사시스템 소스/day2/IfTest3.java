package day2;

public class IfTest3 {
	public static void main(String[] args) {
		// 0 부터 100 사이의 난수를 구한다. 
		// 100 - 90 사이이면 "xx 점은 A 등급입니다."
		// 89 - 80 사이이면 "xx 점은 B 등급입니다."
		// 79 - 70 사이이면 "xx 점은 C 등급입니다."
		// 69 - 60 사이이면 "xx 점은 D 등급입니다."
		// 59 - 0 사이이면 "xx 점은 F 등급입니다."
		// 모두 구현하면 제출하세요.
		int num = (int)(Math.random()*101);
		if(num >= 90)
			System.out.print(num + "점은 A");
		else if(num >=80)
			System.out.print(num + "점은 B");
		else if(num >= 70)
			System.out.print(num + "점은 C");
		else if(num >= 60)
			System.out.print(num + "점은 D");
		else
			System.out.print(num + "점은 F");
		System.out.println("등급입니다.");
	}
}
