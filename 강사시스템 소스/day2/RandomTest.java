package day2;
public class RandomTest {
	public static void main(String[] args) {
		for(int i=0; i < 10; i++) {
			double num = Math.random();
			System.out.print(num+"\t");
			System.out.println((int)(num * 10)); // 0 - 9
			System.out.println((int)(num * 100)); // 0 - 99
			System.out.println((int)(num * 6)+1); 
			System.out.println((int)(num * 45)+1); 
		}
	}
}
