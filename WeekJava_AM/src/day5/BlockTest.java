package day5;

public class BlockTest {
	static {
		System.out.println("static 블럭");      // 프로그램 실행하기 전에 수행
	}
	{
		System.out.println("instance 블럭");     //생성자 메서드와 같은 기능이므로 거의 안씀
	}                                          // instance생성 할 때 마다 수행함  우선순위 1
	BlockTest(){                               // 생성자 메서드			         우선순위 2
		System.out.println("BlockTest()생성자 메서드");
	}
	public static void main(String[] args) {
		System.out.println("main()메서드 호출");
		new BlockTest();
		new BlockTest();
	}

}
