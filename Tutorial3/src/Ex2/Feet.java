package Ex2;

public class Feet {
	
	private int feet;
	private int inches;
	
	public Feet(int feet,int inches) {
		
		this.feet=feet;
		this.inches=inches;
		normalize();
	}
	
	private void normalize() {
		if (inches >= 12) {
			
			feet+=inches/12;
			inches = inches % 12;
		}
	}

	public void add(Feet f1, Feet f2) {
		
		this.feet= f1.feet + f2.feet;
		this.inches= f1.inches + f2.inches;
		normalize();
	}
	
	public void print() {
		
		System.out.println(feet+"'"+inches);
	}
	
	public void print(String msg) {
		
		System.out.print(msg);
		this.print();
		
	}
	
	 
	
	public Feet(Feet len) {
		
		this.feet=len.feet;
		this.inches=len.inches;
		normalize();
	}
	
	public void add (Feet f1) {
		 this.feet += f1.feet;
		 this.inches += f1.inches;
		 normalize();
	}
	
}
