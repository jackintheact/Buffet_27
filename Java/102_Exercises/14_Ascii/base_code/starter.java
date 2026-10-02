/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Welcome to the ASCII Museum!");
		System.out.println("1. Moon");
		System.out.println("2. Jupiter");
		System.out.println("3. Mars");
System.out.println("What Planet would you like to see today???");

		Scanner sc = new Scanner(System.in);
		String exhibit = sc.nextLine();
		

		
		
		if(exhibit.equals("Moon")){
       System.out.println(" _______");
       System.out.println("/      /,");
       System.out.println("/      //");
       System.out.println("/______//");
       System.out.println("(______(/");
		}
		


		else if(exhibit.equals("Jupiter")){
        System.out.println(".---.");
		System.out.println(" /`  |  `/");
		System.out.println(";    |    ;");
		System.out.println(";   /|/    ");
		System.out.println("/ / | / /");
		System.out.println("`'---'`");
		}
		else if(exhibit.equals("Mars")){
                System.out.println("|");
		        System.out.println("|");
		System.out.println(" `.  *  |     .'");
		 System.out.println(" `. ._|_* .'  .");
		 System.out.println("* .'   `.  *");
		 System.out.println("* .'   `.  *");
		 System.out.println("-------|     |-------");
		 System.out.println(".  *`.___.' *  .");
		 System.out.println(" .'  |* `.  *");
		 System.out.println(".' *  |  . `.");
		    System.out.println(". |");

	
		
		}
		else{

		}
       
		
	
	}
}
