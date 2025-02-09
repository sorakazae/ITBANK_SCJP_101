package day3;
public class MethodTest3 {
	public static void printArray(int ary[]){
		for(int element : ary) 
			System.out.print(element+"  ");
		System.out.println();
	}
	public static void main(String[] args) {
		int ary1[ ] = new int[10];
		ary1[0] = 10;
		ary1[1] = 20;
		ary1[2] = ary1[0] + ary1[1];
		int ary2[ ];
		//ary2 = {1, 2, 3, 4, 5};
		ary2 = new int[]{1, 2, 3, 4, 5};		
		
		printArray(ary1);
		printArray(ary2);
		
		for(int i=0; i < ary2.length; i++)
			ary2[i] *= 2;  // a = a+b; a += b;
		printArray(ary2);
	}
}








