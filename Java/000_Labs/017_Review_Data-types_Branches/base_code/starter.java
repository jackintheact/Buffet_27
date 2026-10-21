/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		

		String x = " Evil Jaco";
		String y = " Evil svar";
		String z = " Evil dro";

		System.out.println("x");
		System.out.println("y");
		System.out.println("z");

	    System.out.println("What is your name mightly soldier.");
		System.out.println(x + y + z);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your character choice: ");
		String choice = sc.nextLine();

       String w = " Strength (5 points)";
	   String s = " Intelligence (5 points)";
	   String a = " Charisma (5 points)";
	   String d = " Dexterity (5 points)";

	   System.out.println("w");
	   System.out.println("a");
	   System.out.println("s");
	   System.out.println("d");

       System.out.println("you have 20 points.");
	   System.out.println("Choose the following traits");
	   String choice = sc.nextLine();
	   System.out.println(w + a + s + d);
       
	   if(choice.equals("Strength")){
		System.out.println("Become as strong as hulk");
		 choice = sc.nextLine();
		
	   }
    
	   

	   








		
        
	    

		
	}
}
