/*
  Chapter 10 Self Test
  Question #7: Write a program that copies a file, replacing spaces with hyphens.  Use character stream.  Use try with resources to close files
*/
import java.io.*;

class CharacterCopy {
	public static void main(String args[]) {
		int a;
		
		if (args.length != 2) {
			System.out.println("Usage: java ByteCopy oldfile newfile");
			return;
		}
		
		try (FileReader fr = new FileReader(args[0]);
		     FileWriter fw = new FileWriter(args[1])) {
			do {
				a = fr.read();
				if ((char) a == ' ') a = '-';
				if (a != -1) fw.write(a);
			} while (a != -1);
		}
		catch (IOException exc) {
			System.out.println("I/O Error: " + exc);
		}
	}
}