package day5;
public class BlockTest {
	static {
		System.out.println("static ��");
	}	
	{
		System.out.println("instance ��");
	}	
	BlockTest() {
		System.out.println("BlockTest() ������ �޼���");
	}	
	public static void main(String[] args) {		
		System.out.println("main() �޼��� ȣ��");
		new BlockTest();
		new BlockTest();
	}
}
