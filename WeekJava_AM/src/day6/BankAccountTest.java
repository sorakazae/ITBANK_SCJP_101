package day6;
class BankException extends Exception{
	BankException(String message){
		super(message);
	}
}
class BankAccount{
	String id;
	String name;
	private int amount;        // ĸ��ȭ
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount)throws BankException {
		if(amount<0)
			throw new BankException("���� ���� �Ұ��մϴ�.");
		this.amount = amount;
	}                          // ĸ��ȭ
	
}
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount obj = new BankAccount();
		obj.id = "123-123-123";
		obj.name = "ȫ�浿";
		try{
		obj.setAmount(-10);
		}catch (BankException e){
			System.out.println(e.getMessage());
		}
		System.out.println(obj.name + " ������ �ܾ��� " + obj.getAmount() + " �Դϴ�.");

	}

}
