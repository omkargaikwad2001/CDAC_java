class BoxDemo{
	
	public static void main(String[] args){
	
		Box [] allBoxes = new Box[3]; 
		
		allBoxes[0] = new Box(1,2,3);
		allBoxes[1] = new Box(4,5,6);
		allBoxes[2] = new Box(1,4,3);
		
		allBoxes[0].display();
		System.out.println("Volume for Box 1 = "+allBoxes[0].calc_VolumeOfBox());
		System.out.println();
		
		allBoxes[1].display();
		System.out.println("Volume for Box 2 = "+allBoxes[1].calc_VolumeOfBox());
		System.out.println();

		allBoxes[2].display();
		System.out.println("Volume for Box 3 = "+allBoxes[2].calc_VolumeOfBox());
		
	}


}