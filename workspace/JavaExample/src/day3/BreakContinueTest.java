package day3;

public class BreakContinueTest {

	public static void main(String[] args) {
		// int dan = (int)(Math.random()*9)+1;
		a: for (int dan = 1; dan <= 9; dan++) {     // a라는 라벨을 줌
			System.out.print(dan + "단:");
			for (int i = 1; i < 10; i++){
				/*if(dan*i%2==1)
					continue;*/
				if(dan*i>30)
					break a;  // a라는 라벨이 붙어있는 반복문을 끝냄(밖에 반복문을 끝낼때 사용
				System.out.print("\t" + dan + "x" + i + "=" + dan * i);
			}
			System.out.println();
		}

	}

}
