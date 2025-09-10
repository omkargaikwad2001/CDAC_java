package sports;

public class FootballPlayer extends Player{
	
	private int totalGoals;

	public FootballPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FootballPlayer(int totalGoals,int playerId, double contractFees, String name, int age, int dd, int mm, int yy) {
		super(playerId, contractFees, name, age, dd, mm, yy);
		this.totalGoals = totalGoals;
	}

	public void display() {
		super.display();
		System.out.println("Footballer Total Goals = "+totalGoals);
	}
	
	
	
	

}
