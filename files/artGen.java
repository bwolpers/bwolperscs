//Ben Wolpers
import java.util.Scanner;
import java.util.Random;
public class artGen {

	public static void main(String[] args) throws InterruptedException {
		//ask user for the size of the canvas
		System.out.println("Welcome to 2d art generator!");
		System.out.println("Now define the size of your canvas.");
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		//initializing all the variables
		int x = 0;
		int y = 0;
		int random = 0;
		boolean exit = false;
		int art = 0;
		System.out.print("Please input your x: ");
		x = keyboard.nextInt();
		System.out.print("Please input your y: ");
		y = keyboard.nextInt();
		//tests if user entered numbers less than 1 and terminates program
		if(x < 1 || y < 1)
		{
			System.out.println("Invalid");
			System.exit(0);
		}
		System.out.println("Art generating...");
		Thread.sleep(1000);
		System.out.println("");
		//do while loop counts the art pieces and prints a random art piece
		do {
			art++;
			System.out.println("Random Art Piece " + art);
		//for loop inside a for loop to create the x and y grid
		for (int i = 0; i < y; i++) {
		for (int i1 = 0; i1 < x; i1++) {
			
			random = rand.nextInt(2) + 1;
			if(random == 1) {
			System.out.print("█");
			
		}else if(random == 2) {
			System.out.print(" ");
		}
			
		}
		System.out.println("");
		}
		//If user wants to exit the program they input "no" and the variable exit changes to true closing the program
		System.out.println("Would you like to print another?");
		Scanner keyboard2 = new Scanner(System.in);
		String exitQ = keyboard2.nextLine();
		if(exitQ.equalsIgnoreCase("Yes")) {
			exit = false;
		}else if (exitQ.equalsIgnoreCase("no")) {
			exit = true;
			System.out.println("Bye!");
			System.exit(0);
			
		}else {
			System.out.println("Invalid");
			System.exit(0);
			
		}
		//end of do while loop testing if another art piece should be generated based on if exit is false
		}while(exit == false);
		
		

	}

}
