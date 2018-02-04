/*
 Chapter 3 Self Test
 Question 10: Write a program that converts all uppercase characters to lowercase, and all lowercase to uppercase, until a period is encountered.  Print the number of case changes.
*/

class CaseChanges {
	public static void main(String args[]) throws java.io.IOException {
		char ch;
		int counter = 0;
		
		do {
			ch = (char) System.in.read();
			if (ch >= 'A' & ch <= 'Z') {
				ch+= 32;
				counter++;
			}
			else if (ch >='a' & ch <= 'z') {
				ch-= 32;
				counter++;
			}
			System.out.print(ch);
		} while (ch != '.');
		
		System.out.println("\nNumber of case changes = " + counter);
	}
}