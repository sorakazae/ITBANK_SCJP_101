package day4;
class Card {	
	String kind ;			        // ī���� ���� - �ν��Ͻ� ����
	int number;			        // ī���� ���� - �ν��Ͻ� ����
	static int width = 100;		// ī���� ��   - Ŭ���� ����
	static int height = 250;	// ī���� ���� - Ŭ���� ����
}
public class CardTest{
	public static void main(String args[]) {		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		System.out.println("c1�� " + c1.kind + ", " + c1.number 
		 + "�̸�, ũ��� (" + Card.width + ", " + Card.height + ")");
		System.out.println("c2�� " + c2.kind + ", " + c2.number
		 + "�̸�, ũ��� (" + Card.width + ", " + Card.height + ")");	
		c1.width = 50;
		c1.height = 80;
		System.out.println("c1�� " + c1.kind + ", " + c1.number 
		+ "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")" );
		System.out.println("c2�� " + c2.kind + ", " + c2.number 
		+ "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")" );
	}
}
