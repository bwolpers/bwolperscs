//Ben Wolpers
import java.util.Scanner;
import java.util.ArrayList;
public class temp {

	public static void main(String[] args) {
		ArrayList<Double> temps = new ArrayList<Double>();
		System.out.println("Below Average Temperature Tester:");
		Scanner keyboard = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
		System.out.println("Please enter the temperature for day " + i);
		double temp = keyboard.nextDouble();
		temps.add(temp);
		}
		double sum = 0.0;
		double average = 0.0;
	      for (int i=0; i < temps.size(); i++) {
	            sum += temps.get(i);
	            average = sum / temps.size();
	      }
	      System.out.println("The average temperature was " + average);
	      System.out.println("The days that were below average were: ");
	      for (int i=0; i < temps.size(); i++) {
	    	  if(temps.get(i) < average) {
	    		  System.out.println("Day " + (i+1) + " with " + temps.get(i));
	    	  }
	      }
	      
		}  
	

}


