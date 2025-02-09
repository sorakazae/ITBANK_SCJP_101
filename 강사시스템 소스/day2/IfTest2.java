package day2;

public class IfTest2 {
	public static void main(String[] args) {
		// 1-12 사이의 난수를 구해서
		// 12 또는 1 또는 2 가 추출되면 "XX 월은 겨울 입니다." 를 출력
		// 3 또는 4 또는 5 가 추출되면 "XX 월은 봄 입니다." 를 출력
		// 6 또는 7 또는 8 이 추출되면 "XX 월은 여름 입니다." 를 출력
		// 9 또는 10 또는 11 이 추출되면 "XX 월은 가을 입니다." 를 출력
		
		int month = (int)(Math.random() * 12) + 1;
		System.out.print(month + "월은 ");
		if(month == 12 || month == 1 || month == 2) {
			System.out.print("겨울");
		} else if(month == 3 || month == 4 || month == 5) {
			System.out.print("봄");
		} else if(month == 6 || month == 7 || month == 8) {
			System.out.print("여름");
		} else {
			System.out.print("가을");
		}
		System.out.print("입니다.");
	}
}









