 package by.ldy.hw4.ex02;

public class Main {

	public static void main(String[] args) {
		
		Marks Abit = new Marks();
		
		Abit.add("Vasya", "Petrov", 5, 5, 4, 3);
		Abit.add("Tanya", "Kovaleva", 5, 4, 5, 4);
		Abit.add("Xavier", "Coolman", 3, 4, 5, 5);
		Abit.add("Evgen", "Izmatov", 3, 3, 4, 3);
		Abit.add("Vazgen", "Orel", 4, 3, 3, 4);
		Abit.add("James", "Bond", 5, 5, 5, 5);
		Abit.add("Oksanka", "Svobodova", 3, 5, 5, 4);
		Abit.add("Petya", "Horosh", 3, 4, 5, 3);
		Abit.add("Dzen", "Dostig", 5, 5, 5, 5);
		Abit.add("Neo", "Chosen", 4, 5, 5, 4);
		Abit.add("Kotik", "Lapki", 5, 2, 5, 3);
		
		Abit.showAverageResult();
		System.out.println("");
		Abit.setNumberOfStudents(4);
		Abit.choiceIsMade();
	}

}
