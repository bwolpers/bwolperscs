//Ben Wolpers
import java.util.Scanner;
import java.util.Random;
public class rps {

	public static void main(String[] args) {
		boolean replay = true;	
		do {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();	
		int score = 0;
		int botScore = 0;
		int round = 1;
		System.out.println("Welcome to Rock Paper Scissors!");
		while(round<4) {
		System.out.println("Rock Paper or Scissors?...");
		String answer = keyboard.nextLine();
		int bot = rand.nextInt(3) + 1;
		if(bot == 1) {
			round++;
			if(answer.equalsIgnoreCase("Rock")){
			System.out.println("Bot played Rock!");
			System.out.println("It's a tie!");
			System.out.println("Score: " + score + "-" + botScore);
		}else if(answer.equalsIgnoreCase("paper")){
			System.out.println("Bot played Rock!");
			System.out.println("Player wins!");
			score++;
			System.out.println("Score: " + score + "-" + botScore);
		}else if(answer.equalsIgnoreCase("Scissors")){
			System.out.println("Bot played Rock!");
			
		}else {
			System.out.println("INVALID");
			System.out.println("Bot wins!");
			botScore++;
			System.out.println("Score: " + score + "-" + botScore);
		}
		}else if(bot == 2) {
			round++;
			if(answer.equalsIgnoreCase("Rock")){
				System.out.println("Bot played Paper!");
				System.out.println("Bot wins!");
				botScore++;
				System.out.println("Score: " + score + "-" + botScore);
			}else if(answer.equalsIgnoreCase("paper")){
				System.out.println("Bot played Paper!");
				System.out.println("It's a tie!");
				System.out.println("Score: " + score + "-" + botScore);
			}else if(answer.equalsIgnoreCase("Scissors")){
				System.out.println("Bot played Paper!");
				System.out.println("Player wins!");
				score++;
				System.out.println("Score: " + score + "-" + botScore);
			}else {
				System.out.println("INVALID");
				System.out.println("Bot wins!");
				botScore++;
				System.out.println("Score: " + score + "-" + botScore);
			}
			
			}else if(bot == 3) {
				round++;
				if(answer.equalsIgnoreCase("Rock")){
					System.out.println("Bot played Scissors!");
					System.out.println("Player wins!");
					score++;
					System.out.println("Score: " + score + "-" + botScore);
	
				}else if(answer.equalsIgnoreCase("paper")){
					System.out.println("Bot played Scissors!");
					System.out.println("Bot wins!");
					botScore++;
					System.out.println("Score: " + score + "-" + botScore);
				}else if(answer.equalsIgnoreCase("Scissors")){
					System.out.println("Bot played Scissors!");
					System.out.println("It's a tie!");
					System.out.println("Score: " + score + "-" + botScore);
				
				}else {
					System.out.println("INVALID");
					System.out.println("Bot wins!");
					botScore++;
					System.out.println("Score: " + score + "-" + botScore);
				}
			}
		}
				if(score>botScore) {
					System.out.println(" ");
					System.out.println("YOU WIN!");
				}else if(score == botScore){
					System.out.println(" ");
					System.out.println("IT'S A TIE!");
				}else {
					System.out.println(" ");
					System.out.println("YOU LOSE!");
				}
				System.out.println("Would you like to play again? (Yes/NO)");
				String rep = keyboard.nextLine();
				if(rep.equalsIgnoreCase("yes")) {
					replay = true;
				}else if(rep.equalsIgnoreCase("no")) {
					replay = false;
					System.out.println("Bye!");
				}
	}while(replay == true);

}
}
