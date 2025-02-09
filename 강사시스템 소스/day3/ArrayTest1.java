package day3;
public class ArrayTest1 {
	public static void main(String[] args) {
		//double ary[ ] = new double[ ]{1.1, 2.2, 3.3, 4.4};
		double ary[ ] = {1.1, 2.2, 3.3, 4.4};
		
		for(int i=0; i < ary.length; i++)
			System.out.print(ary[i] + "   ");
		
		System.out.println();
		ary = new double[10];
		
		for(double value : ary)  // JDK 1.5
			System.out.print(value + "   ");
	}

}






