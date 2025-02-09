package day5;

public class OverloadingTest {

	public static void main(String[] args) {
		System.out.println(100);
		System.out.println(3.14);
		System.out.println("가");
		System.out.println("abc");
		System.out.println();
		System.out.println(100 > 50);
		System.out.println(new char[]{'가','나','다'}); // 이미 선언되어 있는 배열변수에게 전달하는 경우 중괄호만 줄 수 없고 배열 생성식을 붙여야 함
		System.out.println(new int[]{1,2,3,4,5});  // println은 char형은 받지만 다른 형은 받지 않는다.
		System.out.println(new double[]{1,2,3,4,5});

	}

}
