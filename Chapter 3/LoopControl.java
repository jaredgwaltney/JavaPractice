/*
 Chapter 3 Self Test
 Question 9: Write a program that uses a for loop to generate and display the progression 1,2,4,8,16,32,64.
*/

class LoopControl {
	public static void main(String args[]) {
		for (int x = 1; x < 100;) {
			System.out.println(x);
			x = x*2;
		}
	}
}