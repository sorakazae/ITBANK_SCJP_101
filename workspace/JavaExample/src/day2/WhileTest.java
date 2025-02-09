package day2;

public class WhileTest {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		/*while(sum < 100){
			i = (int)(Math.random()*50)+1;
			sum += i;
			System.out.println("sum ="+sum);
		}*/
		while(true){
			if(sum>=100)
				break;
			i = (int)(Math.random()*50)+1;
			sum += i;
			System.out.println("sum ="+sum);
		}

	}

}
