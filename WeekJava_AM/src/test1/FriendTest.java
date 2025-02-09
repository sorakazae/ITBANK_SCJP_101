package test1;
class Person{
	private String name;
	Person(String name){
		this.name=name;
	}
	public String getInfo() {
		return name;
	}
}
class Friend extends Person {
	private String phoneNumber;
	private String emailAddr;
	public Friend(String name,String phoneNumber,String emailAddr) {
		super(name);
		this.phoneNumber = phoneNumber;        //
		this.emailAddr = emailAddr;            //
	}
	public String getInfo(){
		return super.getInfo() +"  "+ phoneNumber +"  "+ emailAddr;
	}
}
public class FriendTest{
	public static void main(String[] args) {
		Friend ary[] = new Friend[5];
		ary[0]=new Friend("사과","010-4444-9999","apple45@fruit.com");
		ary[1]=new Friend("포도","010-8855-8855","grape24@fruit.com");
		ary[2]=new Friend("딸기","010-2227-7722","stberry72@fruit.com");
		ary[3]=new Friend("키위","010-7771-8822","kiup76@fruit.com");
		ary[4]=new Friend("체리","010-7788-1212","ch2214@fruit.com");
		for(int i=0;i<5;i++){
			System.out.println(ary[i].getInfo());    //
		}
	}
}
