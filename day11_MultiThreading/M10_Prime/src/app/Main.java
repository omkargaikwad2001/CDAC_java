package app;

public class Main{

	public static void main(String[] args) {
		
		Runnable r = ()->{
			
			for(int i=1;i<=100;i++) {
				if(i<=1) {
					continue;
				}
				boolean flag=true;
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						flag=false;
						break;
					}
				}
				
				if(flag) {
					System.out.print(i+" ");
				}
			}
			
		};
		
		Thread t = new Thread(r);
		
		t.start();
		
	}

}
