package by.ldy.hw4.ex01;

public class Student {
	private String name;
	private String surname;
	private double [] marks;
	private double averageMarkOfStudent;
		
	public Student () {
		
	}
	
	public Student(String name, String surname, double[] marks) {
		super();
		
		this.name = name;
		this.surname = surname;
		this.marks = marks;
		this.averageMarkOfStudent = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
	}
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public double[] getMarks() {
		return marks;
	}
	public void setMarks(double[] marks) {
		this.marks = marks;
	}

	public double getAverageMarkOfStudent() {
		return averageMarkOfStudent;
	}

	public void setAverageMarkOfStudent(double averageMarkOfStudent) {
		this.averageMarkOfStudent = averageMarkOfStudent;
	}
	
	public void showAverageMarkOfStudent() {
		
		System.out.println(name +" " + surname + ", его средний балл равен: "  + averageMarkOfStudent);
	  
	}
	
		
}
