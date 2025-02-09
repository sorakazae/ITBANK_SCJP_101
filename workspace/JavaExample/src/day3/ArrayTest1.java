package day3;

public class ArrayTest1 {

	public static void main(String[] args) {
		//double ary[] = new double[]{1.1, 2.2, 3.3, 4.4};
		double ary[] ={1.1, 2.2, 3.3, 4.4};  // 배열 선언과 배열 생성을 동시에 할 때만 가능
		
		for(int i=0; i<ary.length; i++)
			System.out.print(ary[i]+"   ");
		
		System.out.println();
		ary=new double[10];
		
		for(double value : ary)  // JDK 1.5   인핸스드 for문 (읽기만 가능)
			System.out.print(value+"   ");
	}

}
