package HW1;

public class PotionsClassroom extends Location implements Character{
	
	public PotionsClassroom() {
		System.out.println("You have entered the Potions Classroom.");
		description = "You look around the room and you see Professor Snape standing menacingly in the middle of the room.\nYou look to your east and see a giant cauldron for making potions.\nYou look to your west and spot an unknown potion, sizzling, bubbling, and enticing the eyes on a workbench. \n Maybe I drink it?";
		character = "Snape";
	}
	public void useCauldron() {
		System.out.println("You grab you large wooden spoon sticking out of the boiling hot cauldron and begin to swirl it around, mixing the ingredients");
	}
	public void drinkPotion() {
		System.out.println("You drink the glowing red liquid and cast the magic spell 'Exodus Salorium' to perform levitation!");
	}
	public void talk(String s) {
		if (s==character)
			System.out.println("Stop wasting my time I have students to teach.");
		else
			System.out.println("This character is not in the room...try again!");	
	}
	public void look() {
		System.out.println(description);	
	}
}
