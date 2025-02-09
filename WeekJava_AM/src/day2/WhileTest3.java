package day2;

public class WhileTest3 {

	public static void main(String[] args) {
		char ch = '°¡';
		do{
			ch += (int)(Math.random()*30);
			System.out.println(ch);;
		}while (ch > '°¡' && ch < '³ª');
		System.out.println("¼öÇàÁ¾·á!!");

	}

}

// ¿ì¸®³ª¶ó À¯´ÏÄÚµå Ã¹Â° :°¡  ¸¶Áö¸· :ÆR
