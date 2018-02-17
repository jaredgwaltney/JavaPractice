/*
  Chapter 10 Self Test
  Question #7: Write a program that copies a file, replacing spaces with hyphens.  Use byte stream.  Use traditional file close
*/
import java.io.*;

class ByteCopy {
	public static void main(String args[]) {
		int a;
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		if (args.length != 2) {
			System.out.println("Usage: java ByteCopy oldfile newfile");
			return;
		}
		
		try {
			fin = new FileInputStream(args[0]);
			fout = new FileOutputStream(args[1]);
			do {
				a = fin.read();
				if ((char) a == ' ') a = '-';
				if (a != -1) fout.write(a);
			} while (a != -1);
		}
		catch (IOException exc) {
			System.out.println("I/O Error: " + exc);
		}
		finally {
			try {
				if (fin != null) fin.close();
			} catch (IOException exc) {
				System.out.println("Error closing original file.");
			}
			try {
				if (fout != null) fout.close();
			} catch (IOException exc) {
				System.out.println("Error closing new file.");
			}
		}
	}
}