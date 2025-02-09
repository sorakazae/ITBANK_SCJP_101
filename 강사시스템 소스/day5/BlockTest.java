package day5;
public class BlockTest {
	static {
		System.out.println("static 블럭");
	}	
	{
		System.out.println("instance 블럭");
	}	
	BlockTest() {
		System.out.println("BlockTest() 생성자 메서드");
	}	
	public static void main(String[] args) {		
		System.out.println("main() 메서드 호출");
		new BlockTest();
		new BlockTest();
	}
}
