package HW1;

public class Library extends Location implements Character {
	String quill;
	public Library() {
		System.out.println("You have entered the Hogwarts Library.");
		description = "You look around and are in awe by the sheer size of the library; tens of thousands of books; thousands of shelves; hundreds of narrow rows. You see Hermione standing at he front desk.";
		character = "Hermione";
		quill = "";
	}
	public void readBook() {
		System.out.println("You are now reading the Hogwarts best-seller 'Fantastic Beasts'");
	}
	public void write(String s) {
		quill += s + "\n";
		System.out.println("You wrote: " + quill);
	}
	public void talk(String s) {
		if (s==character)
			System.out.println("Welcome to the Hogwarts Library! Please feel free to read any book that you like or write your wishes on the magic quill.");
		else
			System.out.println("This character is not in the room...try again!");
	}
	public void look() {
		System.out.println(description);
	}
}
