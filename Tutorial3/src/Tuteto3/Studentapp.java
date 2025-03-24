package Tuteto3;

public class Studentapp {

	public static void main (String[] args) {
		
		Student[] S1= new Student[5];
		
		S1[0] = new Student("Akash","SE","0771145331");
		S1[1] = new Student("Akash","SE","0771145331");
		S1[2] = new Student("Akash","SE","0771145331");
		S1[3] = new Student("Akash","SE","0771145331");
		S1[4] = new Student("Akash","SE","0771145331");
		
		
		int i;
		for(i=0; i<5;i++) {
			
			S1[i].Print();
			
		}
		
		System.out.println("Next Student ID"+Student.getNextStudent());
	}
	
}
