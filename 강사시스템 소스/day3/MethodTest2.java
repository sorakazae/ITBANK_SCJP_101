package day3;
public class MethodTest2 {
	public static void main(String[] args) {
		int arg1 = Integer.parseInt(args[0]);
		int arg2 = Integer.parseInt(args[1]);		
		int bigNumber = getBigNumber(arg1, arg2);
		System.out.println("���� ��� �� : "+ bigNumber);	
		if(isEven(arg1)){
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
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
	public static boolean isEven(int number) {
		boolean result = false;
		if(number % 2 == 0) 
			result = true;
		return result;
	}	
}
