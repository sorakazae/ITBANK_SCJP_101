package day3;
public class ProgramArgs2 {
	public static void main(String[] args) {
		if(args.length == 2){	
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			System.out.println("덧셈 결과 : " + (num1 + num2));
		} else {
			System.out.println("프로그램 아규먼트로 숫자 2개를 입력하셩");
		}
	}
}
