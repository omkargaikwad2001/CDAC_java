import java.util.Scanner;
public class Calculator{
	
	private float n1;
	private float n2;

	Calculator(){
		n1=0;
		n2=0;
	}

	Calculator(float n1,float n2){
		this.n1=n1;
		this.n2=n2;
	}

	float add(){
		return n1+n2;
	}

	float sub(){
		return n1-n2;
	}

	float mul(){
		return n1*n2;
	}

	float div(){
		return n1/n2;
	}	

}