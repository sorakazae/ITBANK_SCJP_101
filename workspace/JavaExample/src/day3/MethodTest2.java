package day3;

public class MethodTest2 {

	public static void main(String[] args) {
		int arg1 = Integer.parseInt(args[0]);
		int arg2 = Integer.parseInt(args[1]);
		int bigNumber = getBigNumber(arg1, arg2);
		System.out.println("수행 결과 값:" + bigNumber);
		if(isEven(arg1)){
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
	}
	public static int getBigNumber(int num1, int num2){
		int bigNumber;
		if(num1 > num2)
			bigNumber = num1;
		else
			bigNumber = num2;
		return bigNumber;
	}
	
	public static boolean isEven(int number) {    // 메서드이름이 is로 시작하면 거의 전부 boolean형
		boolean result = false;
		if(number %2 == 0)
			result = true;
		return result;
	}

}
