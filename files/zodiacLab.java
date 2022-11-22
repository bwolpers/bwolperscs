//Ben Wolpers
import java.util.Scanner;

public class zodiacLab {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//User input
		System.out.println("What is your Zodiac?");
		System.out.println("Please enter your numerical birth month:");
		int month = keyboard.nextInt();
		System.out.println("Please enter your birth day:");
		int day = keyboard.nextInt();
		String zodiac = "";
		boolean sign = true;
		//tests if the user entered a valid month
		if (month > 0 && month < 13) {
			//evaluates the zodiac of a users born in specified months
			if (month == 4 || month == 6 || month == 9 || month == 11) {
				if (day > 0 && day < 31) {
					if (month == 4 && day < 20) {
						zodiac = "Aries";
					}else if (month == 4 && day > 19) {
						zodiac = "Taurus";			
					}else if (month == 6 && day > 20) {
						zodiac = "Cancer";
					}else if (month == 6 && day < 21) {
						zodiac = "Gemini";
					}else if (month == 9 && day > 22) {
						zodiac = "Libra";
					}else if (month == 9 && day < 23) {
						zodiac = "Virgo";
					}else if (month == 11 && day > 21) {
						zodiac = "Sagittarius";
					}else if (month == 11 && day < 22) {
						zodiac = "Scorpio";
					}
			
			}else {
				System.out.println("Invalid day");
				sign = false;
			}
			}
			//tests the zodiacs of users born in February
			else if (month == 2) {
				if (day > 0 && day < 30) {
					if (day < 19) {
						zodiac = "Aquarius";
					}else if (day > 18) {
						zodiac = "Pisces";
					}
			}else {
				System.out.println("Invalid day");
				sign = false;
			}
			}
			//tests the zodiacs of users in the remaining months
			else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
				if (day > 0 && day < 32) {
					if (month == 1) {
						if (day > 19) {
							zodiac = "Aquarius";
						}else if (day < 20) {
							zodiac = "Capricorn";
						}
					}else if (month == 3) {
						if (day > 20) {
							zodiac = "Aries";
						}else if (day < 21) {
							zodiac = "Pisces";
						}
					}else if (month == 5) {
						if (day > 20) {
							zodiac = "Gemini";
						}else if (day < 21) {
							zodiac = "Taurus";
						}
					}else if (month == 7) {
						if (day > 22) {
							zodiac = "Leo";
						}else if (day < 23) {
							zodiac = "Cancer";
						}
					}else if (month == 8) {
						if (day > 22) {
							zodiac = "Virgo";
						}else if (day < 23) {
							zodiac = "Leo";
						}
					}else if (month == 10) {
						if (day > 22) {
							zodiac = "Scorpio";
						}else if (day < 23) {
							zodiac = "Libra";
						}
					}else if (month == 12) {
						if (day > 21) {
							zodiac = "Capricorn";
						}else if (day < 22) {
							zodiac = "Sagittarius";
						}
					}
			
			}else {
				System.out.println("Invalid day");
				sign = false;
				
			}
			}
		
		
			
	}else {
		System.out.println("Invalid Month");
		sign = false;
	}
		//if nothing is invalid the users zodiac will be printed
		if (sign == true) {
		System.out.println("Your Zodiac sign is " + zodiac);
	}
		}
	}





