package day2;

public class SwitchTest1 {
	public static void main(String[] args) {
		int number = (int) (Math.random() * 10) + 1;
		switch (number % 2) {
		case 0:
			System.out.println(number + " : Â¦¼ö!");
			break;
		default:
			System.out.println(number + " : È¦¼ö!");			
		}
	}
}
