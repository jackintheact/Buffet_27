/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Welcome to the slot Machine, here are the rules:"); 
		System.out.println("Every player starts with 100 dollars");
		System.out.println("Put in a cost that is less then the amount of money that you have");
		System.out.println("The slot Machine will roll 3 dices");
		System.out.println("If two dices match it will double your money");
		System.out.println("If none of the dices match you lose half your money");
		System.out.println("You can wager 1-10");
		

		int Yes = 0;
		int yes = 0;
        int Y = 0;
		int y = 0;
		Scanner sc = new Scanner(System.in);
	    int money = 100;
	    System.out.println("Would you like to start the slot machine (Yes/yes/Y/y)"); 
		String text = sc.nextLine();
		System.out.println("How much would you like to wager 1-10");
		int a = (int)(Math.random() * 10) + 1;
		int b = (int)(Math.random() * 10) + 1;
		int c = (int)(Math.random() * 10) + 1;

		

		
		


		

        


		


	}
}
