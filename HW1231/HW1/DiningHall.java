package HW1;

public class DiningHall extends Location implements Character {
	
	static final String[] houses = {"Gryffindor", "Hufflepuf", "Ravenclaw", "Slytherin"};
	String house;
	public DiningHall() {
		System.out.println("You have entered the dining hall.");
		description = "The dining hall is the biggest open area inside Hogwarts. Professor Dumbledore is in the hall to welcome new students. \n To your side you see the sorting hat.";
		character = "Dumbledore";
	}
	public void talk(String s) {
		if (s.contains(character))
			System.out.println("Welcome to the dining hall! Interact with the sorting hat to be sorted into a house, then enjoy the food served in the hall.");
		else
			System.out.println("This character is not in the room...try again!");
	}
	public void sortingHat()
	{
		int n = (int) (Math.random()*4);
		house = houses[n];
		System.out.println(house+"!");
	}
	public void food() {
		System.out.println("You are eating food");
	}
	public void look() {
		System.out.println(description);
	}

}
