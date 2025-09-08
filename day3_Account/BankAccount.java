class BankAccount{

	private int accNo;
	private float balance;
	private static float interest_rate;

	static{
		interest_rate=7.25f;
	}
	
		

	public BankAccount(){
		accNo=0;
		balance=0.0f;
	}

	public BankAccount(int accNo,float balance){
		this.accNo=accNo;
		this.balance=balance;
	}

	public BankAccount(BankAccount obj){
		this.accNo=obj.accNo;
		this.balance=obj.balance;
	}

	public void display(){
		System.out.println("AccNo = "+accNo);
		System.out.println("Balance with interest rate = "+calculateUpdatesBalance());
	}

	public float calculateUpdatesBalance(){
		return balance+(balance*interest_rate/100);
	}	
	
	public static void updateInterestRate(float newRateOfInterest){
		interest_rate=newRateOfInterest;
	}
}