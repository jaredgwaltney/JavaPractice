/*
  Try This 10-1
  File comparison
*/
import java.io.*;

class CompFiles {
	public static void main(String args[]) {
		int a, b;
		boolean match = true;
		
		if (args.length != 2) {
			System.out.println("Usage: java CompFiles file1 file2");
			return;
		}
		
		try (FileInputStream fin1 = new FileInputStream(args[0]);
			FileInputStream fin2 = new FileInputStream(args[1])) {
			do {
				a = fin1.read();
				b = fin2.read();
				if (a != b) match = false;
			} while ((match == true) & (a != -1));
		}
		catch (IOException exc) {
			System.out.println("I/O Error: " + exc);
			match = false;
		}
		finally {
			if (match == true) System.out.println("Files match.");
			else System.out.println("Files do not match.");
		}
	}
}
			 