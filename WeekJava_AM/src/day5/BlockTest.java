package day5;

public class BlockTest {
	static {
		System.out.println("static ��");      // ���α׷� �����ϱ� ���� ����
	}
	{
		System.out.println("instance ��");     //������ �޼���� ���� ����̹Ƿ� ���� �Ⱦ�
	}                                          // instance���� �� �� ���� ������  �켱���� 1
	BlockTest(){                               // ������ �޼���			         �켱���� 2
		System.out.println("BlockTest()������ �޼���");
	}
	public static void main(String[] args) {
		System.out.println("main()�޼��� ȣ��");
		new BlockTest();
		new BlockTest();
	}

}
