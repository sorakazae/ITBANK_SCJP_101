


package day3;

public class TwoArrayTest2 {
	public static void main(String args[]) {
		int twoAry[][] = { { 10, 20, 30 }, { 40, 50 }, { 60, 70, 80, 95 } };
		int sum = 0;
		int count = 0;
		for (int i = 0; i < twoAry.length; i++) {
			for (int j = 0; j < twoAry[i].length; j++) {
				sum += twoAry[i][j];
			}
			count += twoAry[i].length;
		}
		System.out.println("�հ� : " + sum);
		System.out.println("����Ÿ�� �Ѱ��� : " + count);
		//System.out.println("��� : "+ (double)sum/count);		
		System.out.printf("��� :  %.2f %n", (double)sum/count);	// JDK 1.5	
	}
}







// System.out.printf("��� : %.2f", (double) sum / count); // JDK 1.5 ���� �߰��� API


// System.out.printf("��� : %.2f", (double) sum / count); // JDK 1.5 ���� �߰��� API



