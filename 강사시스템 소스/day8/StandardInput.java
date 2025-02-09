package day8;
import java.io.*;
public class StandardInput {
	public static void main(String[] args) throws IOException {
		System.out.print("입력 : ");
		int input = new InputStreamReader(System.in).read();
		System.out.println("입력된 문자 ===> "+ (char)input);
	}
}
