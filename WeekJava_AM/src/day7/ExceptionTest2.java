package day7;

public class ExceptionTest2 {

	public static void main(String[] args) {
		System.out.println("main() 수행 시작");
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int result = num1 / num2;
			System.out.println("연산결과 : " + result);
		
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("2개의 인수를 입력하세요!!");
		}catch (ArithmeticException e){
			System.out.println("두 번째 인수로 0이 아닌 숫자를 입력하세요 !!");
		}catch (NumberFormatException e){
			//System.out.println(e.getMessage());  // 에러 매세지 추출
			e.printStackTrace();  // 콜 스택  - 자세한 에러정보 추출
			return;  // jvm 에서의 return = 끝낸다.
		}catch (Exception e){  // e는 변수명이다.
			System.out.println("예외 발생!!!");
		}finally {
			System.out.println("finally 블럭 수행!!");
		}
		System.out.println("main() 수행 종료");
	}

}
