package day2;

public class IfTest3 {

	public static void main(String[] args) {
		// 0���� 100 ������ ������ ���Ѵ�.
		// 100����~90 �����̸� "xx ����  A����Դϴ�."
		// 89����~80 �����̸� "xx ����  B����Դϴ�."
		// 79����~70 �����̸� "xx ����  C����Դϴ�."
		// 69����~60 �����̸� "xx ����  D����Դϴ�."
		// 59����~0 �����̸� "xx ����  F����Դϴ�."
	int jumsu = (int)(Math.random()*100)+1;
	if(jumsu>=90){
		System.out.println(jumsu+"���� A��� �Դϴ�.");
	}else if(jumsu>=80){
		System.out.println(jumsu+"���� B��� �Դϴ�.");
	}else if(jumsu>=70){
		System.out.println(jumsu+"���� C��� �Դϴ�.");
	}else if(jumsu>=60){
		System.out.println(jumsu+"���� D��� �Դϴ�.");
	}else
		System.out.println(jumsu+"���� F��� �Դϴ�.");
	}
}
