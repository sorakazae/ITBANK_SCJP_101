package day3;

public class ProgramArgs1 {

	public static void main(String[] args) {
		System.out.println("���α׷� �ƱԸ�Ʈ�� ���� :"+ args.length);
		
		for(String s:args)
			System.out.println(s);
		
		int[] su = new int[0];
		char[] ch = new char[] {'a'};
		String[] str = new String[]{"abc", "����", "123", "+"};
		
		System.out.println(su.length);
		System.out.println(ch.length);
		System.out.println(str.length);

	}

}
