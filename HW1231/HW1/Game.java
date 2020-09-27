package HW1;
import java.util.Scanner;

public class Game {
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Messrs Moony, Wormtail, Padfoot and Prongs Purveyors of Aids \nto magical Mischief-Makers are proud to present THE MARAUDER'S MAP");
		System.out.println("Say the magic phrase to reveal the map");
		
		while(!obj.nextLine().equalsIgnoreCase("I solemnly swear that I am up for no good"))
		{
			System.out.println("You did not say the correct phrase.");
		}
		
		System.out.println("Up ahead, the doors of hogwarts");
		
		System.out.println("You walk through the door of hogwards. On your north, the dining hall. Your east, the Potions Class. Your West, the library.");
	
		//at this point we need to know which direction to go
		String Location= obj.nextLine();
		while(!Location.equalsIgnoreCase("mischief managed"))
		{
			//Valid: Walk North, Walk east, walk south, go north, go east, go south, move north, move west, move east
			if(Location.contains("North") || Location.contains("north"))
				DiningHall();
			else if(Location.contains("East") || Location.contains("east"))
				PotionsClassroom();
			else if(Location.contains("west") || Location.contains("West"))
				Library();
			else
				System.out.println("You have reached a dead end!");
			Location = obj.nextLine();
		}
		System.out.println("Hiding map contents...end.");
	}
	
	public static void DiningHall() { 
		DiningHall DH= new DiningHall();
		Scanner obj=new Scanner(System.in);
		// valid: use, talk, look, eat food
		String command= obj.nextLine();
		while(true)
		{
			if(command.contains("Sorting hat") || command.contains("sorting hat") || command.contains("Sorting Hat") || command.contains("SortingHat"))
				DH.sortingHat();
			else if(command.contains("talk") || command.contains("Talk")) {
				if (command.contains("Dumbledore") || command.contains("dumbledore"))
					DH.talk("Dumbledore");
				else
					DH.talk(" ");
			}
			else if(command.contains("look") || command.contains("Look") || command.contains("Around") || command.contains("around"))
				DH.look();
			else if(command.contains("eat") || command.contains("Eat") || command.contains("Food") || command.contains("food"))
				DH.food();
			else if(command.contains("leave") || command.contains("Leave") || command.contains("exit") || command.contains("Exit")) {
				System.out.println("You are now exiting Dining Hall.");
				break;
			}
			else if(command.equalsIgnoreCase("mischief managed")) {
				System.out.println("Hiding map contents...end.");
				System.exit(0);
			}
			else
				System.out.println("You stand there, deliberately considering your next move.");				
			command=obj.nextLine();
		}
		
	}
	public static void Library()
	{
		Library L= new Library();
		Scanner obj=new Scanner(System.in);
		
		String command= obj.nextLine();
		while(true)
		{
			if(command.contains("read") || command.contains("Read") || command.contains("book") || command.contains("Book"))
				L.readBook();
			else if(command.contains("talk") || command.contains("Talk")) {
				if (command.contains("hermione") || command.contains("Hermione"))
					L.talk("Hermione");
				else
					L.talk(" ");
			}
			else if(command.contains("look") || command.contains("Look") || command.contains("Around") || command.contains("around"))
				L.look();
			else if(command.contains("write") || command.contains("Write") || command.contains("quill") || command.contains("Quill"))
			{
				System.out.println("What do you want to write?");
				String str = obj.nextLine();
				L.write(str);
			}
			else if(command.contains("leave") || command.contains("Leave") || command.contains("exit") || command.contains("Exit")) {
				System.out.println("You are now exiting Library.");
				break;
			}
			else if(command.equalsIgnoreCase("mischief managed")) {
				System.out.println("Hiding map contents...end.");
				System.exit(0);
			}
			else
				System.out.println("You stand there, deliberately considering your next move.");				
			command=obj.nextLine();
		}
	}
	public static void PotionsClassroom()
	{
		PotionsClassroom Pc= new PotionsClassroom();
		Scanner obj=new Scanner(System.in);
		// valid: use, talk, look, eat food
		String command= obj.nextLine();
		while(true)
		{
			if(command.contains("drink") || command.contains("Drink") || command.contains("Potion") || command.contains("potion"))
				Pc.drinkPotion();
			else if(command.contains("talk") || command.contains("Talk")) {
				if (command.contains("Snape") || command.contains("snape"))
					Pc.talk("Snape");
				else
					Pc.talk(" ");
			}
			else if(command.contains("look") || command.contains("Look") || command.contains("Around") || command.contains("around"))
				Pc.look();
			else if(command.contains("use") || command.contains("Use") || command.contains("Cauldron") || command.contains("cauldron"))
				Pc.useCauldron();
			else if(command.contains("leave") || command.contains("Leave") || command.contains("exit") || command.contains("Exit")) {
				System.out.println("You are now exiting Potions Classroom.");
				break;
			}
			else if(command.equalsIgnoreCase("mischief managed")) {
				System.out.println("Hiding map contents...end.");
				System.exit(0);
			}
			else
				System.out.println("You stand there, deliberately considering your next move.");	
			command=obj.nextLine();
		}
	}
}
