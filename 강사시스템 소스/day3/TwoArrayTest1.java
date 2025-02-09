package day3;
public class TwoArrayTest1 {
	public static void main(String[] args) {
		double[][] twoAry = new double[4][];
		twoAry[0] = new double[5];
		twoAry[1] = new double[8];
		twoAry[2] = new double[2];
		twoAry[3] = new double[5];
		
		for(int i=0; i < twoAry.length; i++){
			for(int j=0; j < twoAry[i].length; j++)
				System.out.print(twoAry[i][j]+" ");
			System.out.println();
		}
	}
}
