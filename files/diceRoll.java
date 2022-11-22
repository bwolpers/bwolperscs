//Ben Wolpers
import java.util.Random;
import java.util.Scanner;
public class diceRoll {
	public static void main(String[] args) {
		//initializing each number on the die
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		System.out.println("Enter the amount of times a 6 sided die should be rolled:");
		Scanner keyboard = new Scanner(System.in);
		int die = keyboard.nextInt();
		//Terminates the program if input is less than 1
		if (die <= 0) {
			System.out.println("INVALID");
			System.exit(0);
		}
		Random random = new Random();
		//for loop that prints out the number but also adds to the final value
		for (int i = 0; i < die; i++) {
		int diceRoll = random.nextInt(6) + 1;
		System.out.println(diceRoll + " was rolled!");
		if (diceRoll == 1) {
			one++;
		}else if (diceRoll == 2) {
			two++;
		}else if (diceRoll == 3) {
			three++;
		}else if (diceRoll == 4) {
			four++;
		}else if (diceRoll == 5) {
			five++;
		}else if (diceRoll == 6) {
			six++;
		}else {
			System.out.println("error");
		}
		}
		//final values of each number printed out
		System.out.println("One: " + one);
		System.out.println("Two: " + two);
		System.out.println("Three: " + three);
		System.out.println("Four: " + four);
		System.out.println("Five: " + five);
		System.out.println("Six: " + six);
	}

	

}
