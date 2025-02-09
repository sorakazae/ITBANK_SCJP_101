package day3;

public class BreakContinueTest {
	public static void main(String[] args) {
		a: for (int dan = 1; dan <= 9; dan++) {
			System.out.print(dan + "´Ü:");
			for (int i = 1; i < 10; i++) {
				if(dan * i > 30)
					break a;
				System.out.print("\t" + dan + "x" + i + "=" + dan * i);
			}
			System.out.println();
		}
	}
}
