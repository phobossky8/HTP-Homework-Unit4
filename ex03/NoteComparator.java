package by.ldy.hw4.ex03;

import java.util.Comparator;

public class NoteComparator implements Comparator<Note> {

	@Override
	public int compare(Note arg0, Note arg1) {

		if (arg0.getDate().getYear() > arg1.getDate().getYear()) {
			return 1;
		}

		if (arg0.getDate().getYear() < arg1.getDate().getYear()) {
			return -1;
		}

		if (arg0.getDate().getYear() == arg1.getDate().getYear()) {

			if (arg0.getDate().getMonth() > arg1.getDate().getMonth()) {
				return 1;
			}

			if (arg0.getDate().getMonth() < arg1.getDate().getMonth()) {
				return -1;
			}

			if (arg0.getDate().getMonth() == arg1.getDate().getMonth()) {

				if (arg0.getDate().getDay() > arg1.getDate().getDay()) {
					return 1;
				}

				if (arg0.getDate().getDay() < arg1.getDate().getDay()) {
					return -1;
				}

				return 1;
			}

		}

		return 1;
	}

}
