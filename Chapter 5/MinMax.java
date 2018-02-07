/*
  Chapter 5 Self Test
  Question #13: Rewrite MinMax class so that it uses a for-each style
*/

class MinMax {
	public static void main(String args[]) {
		int nums[] = { 99, -10, 100123, 18, -987, 5623, 463, -9, 287, 49 };
		int min, max;
		min = max = nums[0];
		
		for (int x: nums) {
			if (x < min) min = x;
			if (x > max) max = x;
		}
		
		System.out.println("Min: " + min + ", Max: " + max);
	}
}