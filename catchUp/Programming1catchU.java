/**
 * 
 */
package catchUp;

import java.util.Scanner;

/**
 * @author justi
 *
 */
public class Programming1catchU {

	/**
	 * 
	 */
	public Programming1catchU() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	
	public static double getRandomIntegerBetweenRange(double max, double min) {
		 max = 6.0;
		 min = 1.0;
		 double x = (int)(Math.random()*((max-min)+1))+min;
		 return x;
		
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner kb = new Scanner(System.in);
	int num1 = 0;
	while(num1 >= 0) {
		System.out.println("\n\n type a positive number");
		num1 = kb.nextInt();
		/** Write a program that will print your initials to standard output in letters
		 *  that are nine lines tall. Each big letter should be made up of a bunch of *'s
		 */
		
		
		System.out.println("********* ***   ***");
		System.out.println("   **     ***   ***");
		System.out.println("   **     *** * ***");
		System.out.println("*  **     *** * ***");
		System.out.println("*****     ***   ***");
		
		/**Write a program that simulates rolling a pair of dice. 
		 * You can simulate rolling one die by choosing one of the integers 1, 2, 3, 4, 5, or 6 at random. 
		 * The number you pick represents the number on the die after it is rolled. 
		 * As pointed out in Section 2.5, the expression
		 * (int)(Math.random()*6) + 1
		 * *does the computation to select a random integer between 1 and 6. 
		 * You can assign this value to a variable to represent one of the dice that are being rolled. 
		 * Do this twice and add the results together to get the total roll. 
		 * Your program should report the number showing on each die as well as the total roll.
		 * **/
		System.out.println("would you like to play a game?(please select 1 or 2, 1 = yes , 2 = no");
		int firstRoll = kb.nextInt();
		if(firstRoll == 1) {
		System.out.println(" your dice roll is: " + getRandomIntegerBetweenRange(6,1));
		} else {
			System.out.println(" okay!! come again then!!!");
		}
		System.out.println(" would you like to roll again?(please select 1 or 2, 1 = yes, 2 = no )");
		int nextRoll = kb.nextInt();
		if(nextRoll == 1) {
			System.out.println("your dice roll is: " + getRandomIntegerBetweenRange(6,1));
		}else {
			System.out.println("thank you and come again!!!");
			
		} 
		int total= firstRoll + nextRoll;
		System.out.println("thank you for playing my lil game, the total of both of your rolls is: " + total);
//	class time //
		
		
		
		
		
		
		
		
	}
		}

	}


