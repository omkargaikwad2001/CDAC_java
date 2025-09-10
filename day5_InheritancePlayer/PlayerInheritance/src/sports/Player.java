package sports;

import utility.Person;

public class Player extends Person{
	
	private int playerId;
	private double contractFees;
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Player(int playerId,double contractFees,String name, int age, int dd, int mm, int yy) {
		super(name, age, dd, mm, yy);
		this.playerId = playerId;
		this.contractFees = contractFees;
	}
	
	public void display() {
		super.display();
		System.out.println("Player Id = "+playerId);
		System.out.println("Player Contract Fees = "+contractFees);
	}
	

}
