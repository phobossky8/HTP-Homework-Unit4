package by.ldy.hw4.ex01;

public class Main {
	public static void main(String[] args) {
					
		Group Newbies = new Group();
		
		Newbies.add("Vasil", "Filimonov", 4, 5, 4, 5, 5);
		Newbies.add("Ivan", "Bodrov", 2, 4, 4, 3, 5);
		Newbies.add("Alena", "Lanskaya", 5, 5, 5, 5, 5);
		Newbies.add("Nikolay", "Usatiy", 5, 4, 2, 5, 2);
		Newbies.add("Galina", "Prostaya", 4, 2, 5, 3, 2);
		
		Newbies.showAverageResult();
		Newbies.showAverageOfGroup();
		
		Newbies.showHighAchievers();
		Newbies.showDowagers();
	}
}
