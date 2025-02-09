package day2;

public class ForTest2 {

	public static void main(String[] args) {
		// int dan = (int)(Math.random()*9)+1;
		for (int dan = 1; dan <= 9; dan++) {
			System.out.print(dan + "´Ü:");
			for (int i = 1; i < 10; i++)
				System.out.print("\t" + dan + "x" + i + "=" + dan * i);
			System.out.println();
		}

	}

}
