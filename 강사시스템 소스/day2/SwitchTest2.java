package day2;

public class SwitchTest2 {
	public static void main(String[] args) {
		int month = (int) (Math.random() * 12) + 1;	
		switch (month) {
		case 12:		
		case 1:		
		case 2:
			System.out.print(month + " 월은 겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.print(month + " 월은 봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.print(month + " 월은 여름");
			break;
		default:
			System.out.print(month + " 월은 가을");			
		}
		System.out.println("입니다.");		
	}
}
