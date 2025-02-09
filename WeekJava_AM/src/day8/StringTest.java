package day8;
public class StringTest {
	public static void main(String[] args) {
		System.out.println("1".length());    // 1
		System.out.println("가나다".length()); // 3
		System.out.println("abc".charAt(1)); // b
		System.out.println("abc".toUpperCase()); //"ABC"
		// A B C D
		String s = args[0] + "&" + args[1] + "*" +
				          args[2] + "%" + args[3]; // 객체를 계속 만들어서 수정
		
		System.out.println(s);
		StringBuffer sb = new StringBuffer(50); // 만들어진 객체에서 추가하며 수정
		sb.append(args[0]);
		sb.append("&");
		sb.append(args[1]);
		sb.append("*");
		sb.append(args[2]);
		sb.append("%");
		sb.append(args[3]);
		String sfromsb = sb.toString();
		System.out.println(sfromsb);
	}

}
