package day3;
public class ProgramArgs2 {
	public static void main(String[] args) {
		if(args.length == 2){	
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			System.out.println("���� ��� : " + (num1 + num2));
		} else {
			System.out.println("���α׷� �ƱԸ�Ʈ�� ���� 2���� �Է��ϼ�");
		}
	}
}
