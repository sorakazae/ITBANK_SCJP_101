package day2;
public class WhileTest3 {
	public static void main(String[] args) {
		char ch = '가';
		do{
			ch  += (int)(Math.random()*30); 
			System.out.println(ch);
		} while (ch > '가' && ch < '나');
		System.out.println("수행종료!!");
	}
	// 가  힣
}
