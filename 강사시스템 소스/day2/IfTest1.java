package day2;

public class IfTest1 {
	public static void main(String[] args) {
		int number = (int)(Math.random() * 10)+1; // 1-10
		
		if(number % 2 == 0)
			System.out.println(number + "�� ¦���Դϴ�.");
		else 
			System.out.println(number + "�� Ȧ���Դϴ�.");
	}
}
