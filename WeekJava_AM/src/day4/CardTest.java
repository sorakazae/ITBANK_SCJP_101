package day4;
class Card{
	
	String kind;        // 카드의 무늬 - 인스턴스 변수      
	int number;         // 카드의 숫자 - 인스턴스 변수
	static int width = 100;     // 카드의 폭   - 클래스 변수
	static int height = 250;       // 카드의 높이 - 클래스 변수
}

public class CardTest {

	public static void main(String[] args) {
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은" + c1.kind + ", " + c1.number
				+ "이며, 크기는(" + Card.width+ ", " + Card.height + ")");
		System.out.println("c2은" + c2.kind + ", " + c2.number
				+ "이며, 크기는(" + Card.width+ ", " + Card.height + ")");
		Card.width = 50;         // static형 변수이기 때문에 c2에도 적용된다.
		Card.height = 80;
		System.out.println("c1은" + c1.kind + ", " + c1.number
				+ "이며, 크기는(" + Card.width+ ", " + Card.height + ")");
		System.out.println("c2은" + c2.kind + ", " + c2.number
				+ "이며, 크기는(" + Card.width+ ", " + Card.height + ")");

	}

}
