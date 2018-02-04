/*
 Chapter 1 Self Test
 Question 10: Adapt Try This 1-2 so that it prints a conversion table of inches to meters.  12 feet, inch by inch.  Blank line every 12 inches  
*/

class InchesToMetersTable {
	public static void main(String args[]) {
		double inches, meters;
		int counter;
		
		counter = 0;
		for (inches = 1; inches <= 144; inches++) {
			meters = inches / 39.37;
			System.out.println(inches + " inches is " + meters + " meters.");
			
			counter++;
			if(counter == 12) {
				System.out.println();
				counter = 0;
			}
		}
	}
}