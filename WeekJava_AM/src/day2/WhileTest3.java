package day2;

public class WhileTest3 {

	public static void main(String[] args) {
		char ch = '가';
		do{
			ch += (int)(Math.random()*30);
			System.out.println(ch);;
		}while (ch > '가' && ch < '나');
		System.out.println("수행종료!!");

	}

}

// 우리나라 유니코드 첫째 :가  마지막 :힣
