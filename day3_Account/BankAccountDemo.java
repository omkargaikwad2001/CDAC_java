public class BankAccountDemo{
	
	public static void main(String[] args){
	
		//default
		BankAccount b1 = new BankAccount();
		b1.display();
		
		//para
		BankAccount b2 = new BankAccount(12345,10000f);
		b2.display();	
		
		//copy
		BankAccount b3 = new BankAccount(b2);
		b3.display();

		System.out.println("\nAfter updating interest balance");
		BankAccount.updateInterestRate(10f);
		b2.display();
	}

}