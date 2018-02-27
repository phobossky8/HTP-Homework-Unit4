package by.ldy.hw4.ex02;

public class Abiturient {

	private String name;
	private String surname;
	double [] marks;
	double averageMark;
	

	
	public Abiturient(String name, String surname, double[] marks) {
		super();
		this.name = name;
		this.surname = surname;
		this.marks = marks;
		this.averageMark = (marks[0] + marks[1] + marks[2] + marks[3]) / marks.length;
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
	public double getAverageMark() {
		return averageMark;
	}
	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}
	
	/*public double calcAverageMark() {
		double sum = 0;
		double average = 0;
		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];			
		}
		average = sum / marks.length;
		return averageMark;
	}*/
	
	public void showAverageMark () {
		System.out.println(name + " " + surname + " средний балл равен: " + averageMark);
	}
	
	
	
	
}
