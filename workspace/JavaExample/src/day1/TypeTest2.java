package day1;

public class TypeTest2 {

	public static void main(String[] args) {
		int name=100;  // �ڹٴ� ������ ��(���� �ʱ�ȭ�� ���� �ʴ°�)�� ������� �ʴ´�.
		//name=100;  // ���� �ʱ�ȭ  
		System.out.println(name);     // ()�� ������ ������ �ν��ϰ�  ������ �޼���� �ν�
		name=200;          // ���ͷ�
		System.out.println(name);
		//200=name;    // ���ͷ��� ���ʿ� �� �� ����.
		name = 10+20;       // �����
		System.out.println(name);
		name = "������".length();
		System.out.println(name);
	}

}
