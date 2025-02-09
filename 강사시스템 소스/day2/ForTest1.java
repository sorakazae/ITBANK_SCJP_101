package day2;

public class ForTest1 {
	public static void main(String[] args) {
		int sum = 0;
		//int i;
		for(int i=1; i < 30; i+=2) 
			sum = sum + i;  // sum += i;
		System.out.println("1 부터 30 사이의 홀수의 합 ==> " + sum);
		//System.out.println(i);
	}
}
