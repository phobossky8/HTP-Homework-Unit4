package by.ldy.hw4.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Marks {

	private List<Abiturient> abiturients;
	private int numberOfStudents;
	private MarksComparator comparator = new MarksComparator();
	private TreeSet <Abiturient> sorted = new TreeSet<Abiturient>(comparator);
	
	

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public Marks() {

		abiturients = new ArrayList<Abiturient>();
	}

	public List<Abiturient> getAbiturients() {
		return abiturients;
	}

	public void setAbiturients(List<Abiturient> abiturients) {
		this.abiturients = abiturients;
	}

	public void add(String name, String surname, int mark1, int mark2, int mark3, int mark4) {

		double[] marks = { mark1, mark2, mark3, mark4 };

		Abiturient newAbiturient = new Abiturient(name, surname, marks);

		abiturients.add(newAbiturient);
		

	}

	public void showAverageResult() {
		
		
		
		for (Abiturient k : abiturients) {
			k.showAverageMark();
		}
	}

	public void choiceIsMade() {
		int count = 0;
		
		for(Abiturient k : abiturients) {
			
			sorted.add(k);
			
		}
		
		for(Abiturient k : sorted) {
			if(count < numberOfStudents) {
			System.out.println(k.getName() + " " + k.getSurname() + " поступил(а)!");
			count++;
			}
		}
	}
}
