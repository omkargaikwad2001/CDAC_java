package sports;

public class CricketPlayer extends Player{

	private int totalRun;
	private int totalWicket;
	
	public CricketPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CricketPlayer(int totalRun,int totalWicket,int playerId, double contractFees, String name, int age, int dd, int mm, int yy) {
		super(playerId, contractFees, name, age, dd, mm, yy);
		this.totalRun = totalRun;
		this.totalWicket = totalWicket;
	}
	
	public void display() {
		super.display();
		System.out.println("Cricketer Total Runs = "+totalRun);
		System.out.println("Cricketer Total Wickets = "+totalWicket);
	}
	
	
	
	
}
