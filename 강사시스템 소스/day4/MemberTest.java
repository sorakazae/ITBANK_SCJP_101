package day4;
public class MemberTest {
	public static void main(String[] args){
		Member obj1 = new Member("java", "1234", "��ũ");	
		System.out.println("��ü���� : " + obj1.getMemberInfo());	
		Member obj2 = new Member();	
		System.out.println("��ü���� : " + obj2.getMemberInfo());		
	}
}
