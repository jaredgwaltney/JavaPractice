/*
 Chapter 3 Self Test
 Question 1: Write a program that reads characters from the keyboard until a period is received.  Have the program count the number of spaces.  Report the total at the end of the program.
*/

class SpaceCounter {
	public static void main(String args[]) throws java.io.IOException {
		char ch;
		int counter = 0;
		do {
			ch = (char) System.in.read();
			if (ch == ' ') counter++;
		} while (ch != '.');
		System.out.println("Number of spaces = " + counter);
	}
}