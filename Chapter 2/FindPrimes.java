/*
 Chapter 2 Self Test
 Question 10: Write a program that finds all prime numbers between 2 and 100
*/

class FindPrimes {
	public static void main(String args[]) {
		int counterA;
		int counterB;
		int remainder;
		boolean isPrime;
		
		for (counterA = 2; counterA <= 100; counterA++) {
			
			isPrime = true;
			
			for (counterB = 2; counterB < counterA; counterB++) {
				remainder = counterA % counterB;
				if (remainder == 0)
					isPrime = false;
			}
			
			if (isPrime)
				System.out.println(counterA);
		}
	}
}
				