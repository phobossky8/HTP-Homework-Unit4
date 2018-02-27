package by.ldy.hw4.ex02;

import java.util.Comparator;

public class MarksComparator implements Comparator<Abiturient> {

	@Override

	public int compare(Abiturient arg1, Abiturient arg2) {

		if (arg1.getAverageMark() > arg2.averageMark) {
			return -1;
		}

		if (arg1.getAverageMark() < arg2.averageMark) {
			return 1;
		}
		
		return 1;
	}

}
