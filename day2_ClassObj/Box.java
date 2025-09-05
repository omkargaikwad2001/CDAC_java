public class Box{

	private int height;
	private int width;
	private int depth;

	Box(){
		height=0;
		width=0;
		depth=0;
	}

	Box(int h,int w,int d){
		height=h;
		width=w;
		depth=d;
	}

	void display(){
		System.out.println("Height = "+height);
		System.out.println("Width = "+width);
		System.out.println("Depth = "+depth);
	}

	int calc_VolumeOfBox(){
		return height*width*depth;
	}
	
	public static void main(String[] args){
		
		Box b = new Box();
		b.display();

		Box b1 = new Box(10,20,30);
		b1.display();
		System.out.println("Volume = "+b1.calc_VolumeOfBox());
		
	
	}

}