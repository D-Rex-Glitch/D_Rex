package Tuteto3;

public class Student {
	
	int StudentID;
	String name;
	String Degree;
	String mobile;
	
	static int max =100; 
	
	public Student(String name, String degree, String mobile ) {
		
		this.StudentID= max++;
		this.name=name;
		this.Degree=degree;
		this.mobile=mobile;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return Degree;
	}

	public void setDegree(String degree) {
		Degree = degree;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void Print() {
		System.out.println("Student ID ="+StudentID);
		System.out.println("Name ="+name);
		System.out.println("Degree ="+Degree);
		System.out.println("Mobile ="+mobile);
		
	}
	
	public static int getNextStudent() {
		
		return max;
		
		
	}

}

