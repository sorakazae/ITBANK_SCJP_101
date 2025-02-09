package day7;

public class ExceptionTest2 {

	public static void main(String[] args) {
		System.out.println("main() ���� ����");
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int result = num1 / num2;
			System.out.println("������ : " + result);
		
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("2���� �μ��� �Է��ϼ���!!");
		}catch (ArithmeticException e){
			System.out.println("�� ��° �μ��� 0�� �ƴ� ���ڸ� �Է��ϼ��� !!");
		}catch (NumberFormatException e){
			//System.out.println(e.getMessage());  // ���� �ż��� ����
			e.printStackTrace();  // �� ����  - �ڼ��� �������� ����
			return;  // jvm ������ return = ������.
		}catch (Exception e){  // e�� �������̴�.
			System.out.println("���� �߻�!!!");
		}finally {
			System.out.println("finally �� ����!!");
		}
		System.out.println("main() ���� ����");
	}

}
