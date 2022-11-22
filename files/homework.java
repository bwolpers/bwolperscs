//Ben Wolpers
import java.util.Scanner;

public class homework {
public static void main(String[] args) {
	//Scanner import
	Scanner keyboard = new Scanner(System.in);
	//Binary 1
	System.out.println("Please type the first binary number:");
	String binary = keyboard.nextLine();
	int sum1 = 0;
	if(binary.charAt(3) == '1')
	{
		sum1 += 1;
	}
	if(binary.charAt(2) == '1')
	{
		sum1 += 2;
	}
	if(binary.charAt(1) == '1')
	{
		sum1 += 4;
	}
	if(binary.charAt(0) == '1')
	{
		sum1 += 8;
	}
	//Binary 2
	System.out.println("Please type the second binary number:");
	String binary2 = keyboard.nextLine();
	int sum2 = 0;
	if(binary2.charAt(3) == '1')
	{
		sum2 += 1;
	}
	if(binary2.charAt(2) == '1')
	{
		sum2 += 2;
	}
	if(binary2.charAt(1) == '1')
	{
		sum2 += 4;
	}
	if(binary2.charAt(0) == '1')
	{
		sum2 += 8;
	}
	//decimal numbers
	System.out.println("Decimal 1: " + sum1);
	System.out.println("Decimal 2: " + sum2);
	//sum of decimal numbers
	int finalSum = sum1 + sum2;
	System.out.println("Result: " + (finalSum));
}
}
