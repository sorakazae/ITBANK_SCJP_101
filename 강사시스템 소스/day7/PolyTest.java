package day7;

public class PolyTest {
	public static void main(String[] args) {
		printObjectInfo(new Object());
		printObjectInfo(new String("������"));
		printObjectInfo("ABC");
		printObjectInfo(new java.util.Date());
		printObjectInfo(new java.io.File("c:/"));
		printObjectInfo(new int[10]);
		printObjectInfo(new double[10]);
		printObjectInfo(new day4.Member());
	}
	static void printObjectInfo(Object o){
		if( o instanceof String ) {
			System.out.print("String ��ü ���� : " + o.toString());
			System.out.println(" ���޵� ���ڿ��� ���� : " + ((String)o).length());
		} else {
			System.out.println("���޵� ��ü�� Ŭ���� �� : " +
	                                  				o.getClass().getName());
		}
	}
}
