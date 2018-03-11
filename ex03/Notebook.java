package by.ldy.hw4.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Notebook {

	private String ownerName;
	private String ownerSurname;

	NoteComparator comparator = new NoteComparator();

	private List<Note> notes = new ArrayList<Note>();
	private TreeSet<Note> sorted = new TreeSet<Note>(comparator);

	public Notebook() {

	}

	public Notebook(String ownerName, String ownerSurname) {
		this.ownerName = ownerName;
		this.ownerSurname = ownerSurname;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerSurname() {
		return ownerSurname;
	}

	public void setOwnerSurname(String ownerSurname) {
		this.ownerSurname = ownerSurname;
	}

	public void add(String text, int year, int month, int day) {
		Note newNote = new Note(text, new Date(year, month, day), true);
		notes.add(newNote);
	}
	
	public void remove(String text) {
		notes.remove(new Note());
	}

	public void showAllNotes() {
		System.out.println("NOTEBOOK " + "\"" + ownerName + " " + ownerSurname + "\"");
		for (Note n : notes) {
			System.out.println(n.getText() + "  ||  " + n.getDate().getYear() + "/" + n.getDate().getMonth() + "/"
					+ n.getDate().getDay());
		}
	}

	public TreeSet<Note> sortByDate() {
		for (Note n : notes) {
			sorted.add(n);
		}
		System.out.println(" ");
		return sorted;
	}

	public void showSortedNotes() {
		System.out.println("---------Sorted Notebook---------");
		for (Note n : sorted) {
			System.out.println(n.getText() + "  ||  " + n.getDate().getYear() + "/" + n.getDate().getMonth() + "/"
					+ n.getDate().getDay());
		}
		System.out.println(" ");
	}

	public void searchNoteByKeyWords() {
		System.out.print("Enter key words for search: ");
		Scanner sc = new Scanner(System.in);
		String keyWords = sc.nextLine();

		for (Note n : sorted) {
			if (n.getText().toLowerCase().contains(keyWords.toLowerCase())) {
				System.out.println(n.getText() + "  ||  " + n.getDate().getYear() + "/" + n.getDate().getMonth() + "/"
						+ n.getDate().getDay());
			}
		}
		System.out.println(" ");
	}

	public void searchNoteByYear() {
		System.out.print("Enter YEAR for search: ");
		Scanner sc = new Scanner(System.in);
		int keyWords = sc.nextInt();

		for (Note n : sorted) {
			if (n.getDate().getYear() == keyWords) {
				System.out.println(n.getText() + "  ||  " + n.getDate().getYear() + "/" + n.getDate().getMonth() + "/"
						+ n.getDate().getDay());
			} 
		}		
	}

}
