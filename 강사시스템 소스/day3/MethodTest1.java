package day3;
public class MethodTest1 {	
	public static void printHello() {
		System.out.println("Hello(no argument)!!");		
	}	
	public static String printHello(int num) {		
		if(num <= 0)
			return "��";
		for(int i=0; i < num; i++)
			System.out.println("Hello(int)!!");
		return "��";
	}	
	public static boolean printHello(boolean flag){
		if(flag)
			System.out.println("Hello(boolean)!!");
		return flag;
	}	
	public static void main(String[] args) {
		System.out.println("main() ���� ����");
		printHello();
		String s = printHello(5)+"!!";
		System.out.println("���ϰ� : "+ s +"!!");
		System.out.println(printHello(true));
		System.out.println("main() ���� ����");		
	}			
}





