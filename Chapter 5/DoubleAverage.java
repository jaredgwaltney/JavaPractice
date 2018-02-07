/*
  Chapter 5 Self Test
  Question 3:  Write a program that uses an array to find the average of 10 doubles.
*/

class DoubleAverage {
	public static void main(String args[]) {
		double arr1[] = { 1.0, 45.5, 80.5, 900.7, 204.1, 678.2, 345.8, 101.9, 90.1, 76.8 };
		double doubleAvg = 0;
		for (double x: arr1) {
			doubleAvg += x;
		}
		doubleAvg = doubleAvg/10;
		System.out.println("Average is " + doubleAvg);
	}
}