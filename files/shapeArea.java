//Ben Wolpers
import java.util.Scanner;
public class shapeArea {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to shape area computer!");
		System.out.println("What shape would you like to compute the area of?");
		System.out.println("1) Square");
		System.out.println("2) Circle");
		System.out.println("3) Triangle"); 	
		int shape = keyboard.nextInt();
		if (shape == 1) {
			RectArea();
		}else if(shape == 2) {
			CircleArea();
		}else if(shape == 3) {
			TriArea();
		}else {
			System.out.println("INVALID");
			System.exit(0);
		}
		System.out.println("");
		System.out.println("Have a great day!");
		System.exit(0);
}
	public static void RectArea() {
		Scanner key = new Scanner(System.in);
		System.out.println("You are computing the area of a square.");
		System.out.print("Please input side 1:");
		int side1 = key.nextInt();
		System.out.print("Please input side 2:");
		int side2 = key.nextInt();
		System.out.print("The area of your square is " + side1*side2 + ".");
}
	public static void CircleArea() {
		Scanner key = new Scanner(System.in);
		System.out.println("You are computing the area of a circle.");
		System.out.print("Please input the radius:");
		int radius = key.nextInt();
		System.out.print("The area of your circle is " + Math.PI*radius*radius + ".");
}
	public static void TriArea() {
		Scanner key = new Scanner(System.in);
		System.out.println("You are computing the area of a right triangle.");
		System.out.print("Please input side 1:");
		int side1 = key.nextInt();
		System.out.print("Please input side 2:");
		int side2 = key.nextInt();
		System.out.print("The area of your triangle is " + (side1*side2)/2 + ".");
}	
}
