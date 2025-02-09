package day6;
class T1 extends Object{
	int x=1;
	int y=2;
}
class T2 extends T1 {
	int x=10;
	void printX() {
		int x = 100;
		System.out.println(x);      		// 100	
		System.out.println(this.x);  	 	// 10
		System.out.println(super.x); 	// 1
		System.out.println(y);     			// 2  	
		System.out.println(this.y);   		// 2  
		System.out.println(super.y);     // 2
		//System.out.println(z); 
	}	
}
public class VariableTest {
	public static void main(String[] args) {
		new T2().printX();			
	}
}





