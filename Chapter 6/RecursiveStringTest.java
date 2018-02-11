/*
 Chapter 6 Self Test
 Question #6: Write a recursive method that displays the contents of a string backwards
*/

class RecursiveString {
	public void displayString(String a) {
		int length = a.length()-1;
		int position = 0;
		System.out.println(displayBackwards(a, length, position));
	}
	
	public char displayBackwards(String str, int length, int position) {
		if (position == length) {
			return str.charAt(position);
		}
		System.out.print(displayBackwards(str, length, position+1));
		return str.charAt(position);
	}
}

class RecursiveStringTest {	
	public static void main(String args[]) {
		RecursiveString r = new RecursiveString();
		r.displayString("Hello World");
		r.displayString("ABC123");
		r.displayString("Z");
	}
}