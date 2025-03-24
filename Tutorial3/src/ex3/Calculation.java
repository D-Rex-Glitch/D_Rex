package ex3;

public class Calculation {
	
	public static int no1;
	public static int no2;
	
	
	
	public Calculation(int n1,int n2) {
		
		no1=n1;
		no2=n2;
		
	}
	
	public static int add() {
		
		return Calculation.no1+Calculation.no2;
		
	}
	
	public static int sub() {
		
		return Calculation.no1-Calculation.no2;
	}
	
	
	public static void print() {
		
		System.out.println("Addition ="+add() );
		System.out.println("Substraction ="+sub());
	}
	

}
