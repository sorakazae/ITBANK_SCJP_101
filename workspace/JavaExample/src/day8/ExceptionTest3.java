package day8;
class TestException extends Exception{
	TestException(String message){
		super(message);
	}
}
public class ExceptionTest3 {

	public static void main(String[] args)throws TestException {
		System.out.println("main() ���� ����");
		a();
		System.out.println("main() ���� ����");

	}
	static void a(){
		System.out.println("a() ���� ����");
		try{
			b();
		}catch (TestException e){
			System.out.println("==============");
			System.out.println(e.getMessage());
			System.out.println("==============");
			e.printStackTrace();
		}
		System.out.println("a() ���� ����");
	}
	static void b() throws TestException{
		System.out.println("b() ���� ����");
		c();
		System.out.println("b() ���� ����");
	}
	static void c() throws TestException{
		System.out.println("c() ���� ����");
		int num = (int)(Math.random()*2);
		if(num==1){
			throw new TestException(":::�׽�Ʈ�� ���ܹ߻���Ŵ:::");
		}else{
			System.out.println("��������");
		}
		System.out.println("c() ���� ����");
	}
}
