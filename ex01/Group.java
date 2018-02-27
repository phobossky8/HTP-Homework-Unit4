package by.ldy.hw4.ex01;

import java.util.ArrayList;
import java.util.List;

public class Group {
	private List<Student> students;
	private static int numberOfStudents;
	private double averageOfGroup;

	public Group() {
		students = new ArrayList<Student>();
	}
	
	public List<Student> getStudents() {
		return students;
	}

	public void add(String name, String surname, int mark1, int mark2, int mark3, int mark4, int mark5) {

		double[] marks = { mark1, mark2, mark3, mark4, mark5 };

		Student newStudent = new Student(name, surname, marks);
		students.add(newStudent);
		numberOfStudents = students.size(); 
	}

	public void showAverageResult() {
		for (Student k : students) {
			k.showAverageMarkOfStudent();
		}

	}
	
	public void showAverageOfGroup() {
				
		double sum = 0;
		
		for(Student k : students) {
			sum = sum + k.getAverageMarkOfStudent();
		}
		
		averageOfGroup = sum / numberOfStudents;
		
		System.out.println("");
		System.out.println("Средний балл учебной группы: " + averageOfGroup);
		System.out.println("");
	}
	
	public void showHighAchievers() {  //считаем, что отличники - те, у которых все экзамены на 5 (высший балл)
		int count = 0;
		
		for(Student k : students ) {
			if( k.getAverageMarkOfStudent() == 5) {
				count++;
			}
		}
		
		System.out.println("Количество отличников : " + count);
		
	}

	public void showDowagers() {
		int count = 0;
		for( Student k : students) {
			for(double i : k.getMarks()) {
				if(i <= 2) {
					count++;
					break;
				}
			}
		}
		
		System.out.println("Количество студентов, имещюих двойки : " + count);
		
	}
}
