package day8;
import java.io.*;
public class StandardInput {
	public static void main(String[] args) throws IOException {
		System.out.print("�Է� : ");
		int input = new InputStreamReader(System.in).read();
		System.out.println("�Էµ� ���� ===> "+ (char)input);
	}
}
