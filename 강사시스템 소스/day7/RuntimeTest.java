package day7; 
public class RuntimeTest {
	public static void main(String[] args) throws Exception {
		Runtime obj = Runtime.getRuntime();
		//obj.exec("c:/windows/notepad.exe");
		System.out.println(obj.toString());
		Runtime obj2 = Runtime.getRuntime();
		System.out.println(obj2.toString());	
		Runtime obj3 = Runtime.getRuntime();
		System.out.println(obj3.toString());	
	}
}




