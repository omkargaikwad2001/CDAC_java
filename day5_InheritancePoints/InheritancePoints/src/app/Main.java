package app;

import geometry.ColorPoints;

public class Main {

	public static void main(String[] args) {
		
		ColorPoints cp1 = new ColorPoints(10, 20, "red");
        ColorPoints cp2 = new ColorPoints(30, 40, "green");
        ColorPoints cp3 = new ColorPoints(50, 60, "purple"); 
        ColorPoints cp4 = new ColorPoints(70, 80, "Blue");   

        cp1.display();
        cp2.display();
        cp3.display();
        cp4.display();

	}

}
