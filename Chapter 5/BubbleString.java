/*
 Chapter 5 Self Test
 Question 4: Use bubble sort from Try This 5-1 to sort array of strings
*/

class BubbleString {
	public static void main(String args[]) {
		String strs[] = { "Hello", "Howdy", "Bonjour", "Hola", "GutenTag", "Ciao", "Namaste", "Salaam", "Konnichiwa", "NiHau" };
		int a, b;
		String t;
		int size;
		
		size = strs.length;
		
		System.out.println("Original array is:");
		for (int i=0; i<size; i++) {
			System.out.print(" " + strs[i]);
		}
		System.out.println();
		
		for (a=1; a<size; a++) {
			for (b=size-1; b>=a; b--) {
				if (strs[b-1].compareTo(strs[b]) > 0) {
					t = strs[b-1];
					strs[b-1] = strs[b];
					strs[b] = t;
				}
			}
		}
		
		System.out.println("Sorted array is:");
		for (int i=0; i<size; i++) {
			System.out.print(" " + strs[i]);
		}
	}
}