package day6;
class BankException extends Exception{
	BankException(String message){
		super(message);
	}
}
class BankAccount{
	String id;
	String name;
	private int amount;        // Ä¸½¶È­
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount)throws BankException {
		if(amount<0)
			throw new BankException("À½ÀÇ °ªÀº ºÒ°¡ÇÕ´Ï´Ù.");
		this.amount = amount;
	}                          // Ä¸½¶È­
	
}
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount obj = new BankAccount();
		obj.id = "123-123-123";
		obj.name = "È«±æµ¿";
		try{
		obj.setAmount(-10);
		}catch (BankException e){
			System.out.println(e.getMessage());
		}
		System.out.println(obj.name + " °í°´´ÔÀÇ ÀÜ¾×Àº " + obj.getAmount() + " ÀÔ´Ï´Ù.");

	}

}
