package day1;
public class OperTest1 {
	public static void main(String[] args) {
		int num = 10;
		System.out.println(num);     // 10
		System.out.println(++num); // 11
		System.out.println(num++); // 11
		System.out.println(num);     // 12
		
		num = 10;		
		System.out.println(num);     // 10
		System.out.println(++num); // 11
		System.out.println(++num); // 12
		System.out.println(num);     // 12
		
		num = 10;		
		System.out.println(num);     // 10
		System.out.println(num++); // 10
		System.out.println(num++); // 11
		System.out.println(num);     // 12
	}

}
