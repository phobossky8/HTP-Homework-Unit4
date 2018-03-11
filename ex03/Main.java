package by.ldy.hw4.ex03;

public class Main {

	public static void main(String[] args) {

		Notebook myNoteBook = new Notebook("My", "Treasure");

		myNoteBook.add("Hello! It's me.", 2012, 5, 1);
		myNoteBook.add("I was wondering if after all these years you'd like to meet", 2008, 8, 13);
		myNoteBook.add("They say that time's supposed to heal ya", 2016, 2, 15);
		myNoteBook.add("Such a bad code", 2012, 5, 24);
		myNoteBook.add("I can't believe it", 2008, 4, 24);
		myNoteBook.add("Go away!", 2010, 4, 24);

		myNoteBook.showAllNotes();

		myNoteBook.sortByDate();		

		myNoteBook.showSortedNotes();
		
		myNoteBook.searchNoteByKeyWords();
		
		myNoteBook.searchNoteByYear();

	}

}
