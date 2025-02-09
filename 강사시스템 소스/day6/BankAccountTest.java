package day6;
class BankException extends Exception {
	BankException(String message){
		super(message);
	}
}
class BankAccount {
	String id;
	String name;
	private int amount;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) throws BankException{
		if(amount < 0)
			throw new BankException("음의 값은 불가합니다.");
		this.amount = amount;
	}	
	
}
public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount obj = new BankAccount();
		obj.id = "123-123-123";
		obj.name = "홍길동";
		try {
			obj.setAmount(-10);
		} catch (BankException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(obj.name +
				"고객의 잔액은 " + obj.getAmount() + "원입니다..");	
	}
}



