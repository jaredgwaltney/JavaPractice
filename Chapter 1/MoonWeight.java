/* 
 Chapter 1 Self Test
 Question 9: The moon's gravity is about 17 percent that of earth's.  Write a program that computes your effective weight on the moon.
*/

class MoonWeight {
	public static void main(String args[]) {
		double earthWeight, moonWeight;
		
		for (earthWeight = 1; earthWeight <= 300; earthWeight++) {
			moonWeight = earthWeight * 0.17;
			System.out.println(earthWeight + " lbs on Earth = " + moonWeight + " lbs on the moon.");
		}
	}
}