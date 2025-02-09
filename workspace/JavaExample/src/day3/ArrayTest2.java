package day3;
public class ArrayTest2 {
	public static void main(String[] args) {
		int ary1[ ] = new int[10];
		ary1[0] = 10;
		ary1[1] = 20;
		ary1[2] = ary1[0] + ary1[1];
		int ary2[ ];
		//ary2 = {1, 2, 3, 4, 5};
		ary2 = new int[]{1, 2, 3, 4, 5};		
		
		for(int element : ary1) 
			System.out.print(element+"  ");
		System.out.println();
		
		for(int element : ary2) 
			System.out.print(element+"  ");
		System.out.println();	
		
		for(int i=0; i < ary2.length; i++)
			ary2[i] *= 2;  // a = a+b; a += b;
		
		for(int element : ary2) 
			System.out.print(element+"  ");
	}
}








