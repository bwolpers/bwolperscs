//Ben Wolpers
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		double lengthInp = 0;
		String nameInp = null;
		String colorInp = null;
		Scanner key = new Scanner(System.in);
		String create = "Creating new lizard";
		System.out.println("Welcome to the Lizard store!");
		System.out.println("Do you want to buy a lizard?");
		String ans = key.nextLine();
		if (ans.equalsIgnoreCase("yes")) {
			System.out.println("What is your new Lizards name?");
			nameInp = key.nextLine();
			System.out.println("What is your new Lizards color?");
			colorInp = key.nextLine();
			System.out.println("What is your new Lizards length in feet?");
			lengthInp = key.nextDouble();
			
			for (int i = 0; i < create.length(); i++){
				System.out.print(create.charAt(i));
				Thread.sleep(75);
			}
			for (int i = 0; i < 3; i++) {
			Thread.sleep(300);
			System.out.print(".");
			}
			System.out.println("");
			Lizard liz = new Lizard(lengthInp, nameInp, colorInp);
			System.out.println("");
			System.out.println("Congrats on your new lizard! Here is the info: ");
			System.out.println(liz.toString());
			System.out.println("Have a great day!");
		}else if(ans.equalsIgnoreCase("no")){
			System.out.println("Thanks for shopping with us!");
			System.exit(0);
		}else {
			System.out.println("Invalid input!");
			System.exit(0);
		}
		
			 
	}

	}


