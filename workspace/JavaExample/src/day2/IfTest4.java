package day2;

public class IfTest4 {

	public static void main(String[] args) {
		int num = 100;
		if(num > 100 && ++num == 101) { 
			System.out.println("SUCCESS");
			System.out.println("!!");
		} else {
			System.out.println("FAIL");
		}
		System.out.println(num); 
		// FAIL 100
	}
}
