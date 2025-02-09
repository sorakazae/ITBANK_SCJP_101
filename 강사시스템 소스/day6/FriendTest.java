package day6;

class Person {
	private String name;
	Person(String name) {
		this.name = name;
	}
	public String getInfo() {
		return name;
	}
}
class Friend extends Person {
	private String phoneNumber;
	private String emailAddr;

	public Friend(String name, String phoneNumber, String emailAddr) {
		super(name);
		this.phoneNumber = phoneNumber;
		this.emailAddr = emailAddr;
	}
	public String getInfo() {
		return super.getInfo() + "    " + phoneNumber + "    " + emailAddr;
	}
}
public class FriendTest {
	public static void main(String[] args) {
		Friend ary[] = new Friend[5];
		ary[0] = new Friend("È«±æµ¿", "010-2034-3345", "asdfg@gmail.com");
		ary[1] = new Friend("±è°©¼ö", "010-1234-6685", "qwerty@gmail.com");
		ary[2] = new Friend("Àå±æ»ê", "010-7987-1168", "zxcvbn@gmail.com");
		ary[3] = new Friend("ÀÓ²©Á¤", "010-4574-3695", "hjkkgh@gmail.com");
		ary[4] = new Friend("°ûÁ¤¿ì", "010-3454-9812", "afggyu@gmail.com");

		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i].getInfo());
		}
	}
}
