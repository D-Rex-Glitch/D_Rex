package Ex2;

public class Test {

	public static void main(String[] args) {
		
		Feet f1= new Feet(5,8);
		Feet f2= new Feet(3,10);
		
		Feet result = new Feet(0,0);
		
		result.add(f1,f2);
		
		result.print("Total Length :");
		
		Feet mylength = new Feet(5,6);
		Feet newlen = new Feet(6,7);
		mylength.add(newlen);
		mylength.print();
		
		
	}
}
