/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Math.max(1,2);
		Math.sqrt(4);
		Math.pow(2,4);

      	String x = " Wizard";
		String y = " Warrior";
		String z = " Rogue";

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		System.out.println("Choses your character");
		System.out.println(x + y + z);
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your character choice: ");
		String choice = sc.nextLine();

		System.out.print("x equals choice: " + x.equals(choice));
		System.out.print("y equals choice: " + y.equals(choice));
		System.out.print("z equals choice: " + z.equals(choice));

	}
}
