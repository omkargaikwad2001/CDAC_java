package app;

import sports.CricketPlayer;
import sports.FootballPlayer;
import sports.Player;

public class Main {

	public static void main(String[] args) {

//		Player p1 = new Player(101,6000.455,"Person1",20,1,1,1111);
//		p1.display();
		
//		CricketPlayer c1 = new CricketPlayer(2000,256,101,6000.455,"Person1",20,1,1,1111); 
//		c1.display();
		
//		FootballPlayer f1 = new FootballPlayer(800,102,7000.455,"Person2",30,2,2,2222);
//		f1.display();
		
		Player p1 = new CricketPlayer(2000,256,101,6000.455,"Person1",20,1,1,1111);
		p1.display();
		System.out.println();
		
		Player p2 = new FootballPlayer(800,102,7000.455,"Person2",30,2,2,2222);
		p2.display();
		
	}

}
