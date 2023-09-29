import java.util.*;
public class Test2_game {
	 public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int rand = (int) ((100* Math.random())+1);
//		System.out.println(rand);
		int option = 5;
		int i;
		
		
		System.out.println("----------OASIS INFOBYTE---------");
		System.out.println("----------TASK--2--------");
		System.out.println("-------you have 5 chance to guess The right number and win the game--------- ");
		System.out.println("-------------Guess the number between 1 to 100------------");
		
		
		for(i = 0; i < option; i++) {
			
				
			int number1 = scan.nextInt();
			
			if(rand == number1) {
				System.out.println("----------Congratulation you win the game---------");
				break;
			}
			else if(rand < number1) {
				System.out.println("your number is high");
			}
			else if(rand > number1) {
				System.out.println("your number is less");
			}
		}
		if(i==option) {
			System.out.println("-----------------sorry no more option game over------------------");
		}
		
	}
	 }

