/*
 Try This 5-3
 Bitwise operations
*/

class BitOps {
	int numbits;
	
	BitOps(int n) {
		numbits = n;
	}
	
	void show(long val) {
		long mask = 1;
		
		mask <<= numbits-1;
		
		int spacer = 0;
		for (;mask != 0; mask >>>= 1) {
			if ((val & mask) != 0) System.out.print("1");
			else System.out.print("0");
			spacer++;
			if ((spacer % 8) == 0 ) {
				System.out.print(" ");
				spacer = 0;
			}
		}
		System.out.println();
	}
	
	char UpCase(char ch) {
		return (char) ((int) ch & 65503);
	}
	
	char LowCase(char ch) {
		return (char) ((int) ch | 32);
	}
	
	String Encode(String str) {
		String encmsg = "";
//		int key = 88;
		String key = "abcdefgh";		// Chapter 5 Self Test #7 - use 8 character string as key
		while (key.length() < str.length()) {
			key += key;
		}
		
		for (int i=0; i<str.length(); i++) {
			//encmsg = encmsg + (char) (str.charAt(i) ^ key);
			encmsg = encmsg + (char) (str.charAt(i) ^ key.charAt(i));
		}
		return encmsg;
	}
	
	String Decode(String str) {
		String decmsg = "";
//		int key = 88;
		String key = "abcdefgh";		// Chapter 5 Self Test #7 - use 8 character string as key
		while (key.length() < str.length()) {
			key += key;
		}
		
		for (int i=0; i<str.length(); i++) {
			//decmsg = decmsg + (char) (str.charAt(i) ^ key);
			decmsg = decmsg + (char) (str.charAt(i) ^ key.charAt(i));
		}
		return decmsg;
	}
	
	void PrintNot(byte orig) {
		System.out.print("Original =      ");
		for (int i=128; i>0; i=i/2) {
			if ((orig & i) != 0) System.out.print("1");
			else System.out.print("0");
		}
		System.out.println();
		orig = (byte) ~orig;
		System.out.print("Not(Reversed) = ");
		for (int i=128; i>0; i=i/2) {
			if ((orig & i) != 0) System.out.print("1");
			else System.out.print("0");
		}
		System.out.println();
	}
	
	void ShiftDemo() {
		int val = 1;
		for (int i=0; i<8; i++) {
			for (int t=128; t>0; t=t/2) {
				if ((val & t) != 0) System.out.print("1");
				else System.out.print("0");
			}
			System.out.println();
			val = val << 1;
		}
		
		val = 128;
		for (int i=0; i<8; i++) {
			for (int t=128; t>0; t=t/2) {
				if ((val & t) != 0) System.out.print("1");
				else System.out.print("0");
			}
			System.out.println();
			val = val >> 1;
		}
	}
}

class ShowBitsDemo {
	public static void main(String args[]) {
		BitOps b = new BitOps(8);
		BitOps i = new BitOps(32);
		BitOps li = new BitOps(64);
		
		System.out.println("123 in binary: ");
		b.show(123);
		
		System.out.println("\n87987 in binary: ");
		i.show(87987);
		
		System.out.println("\n237658768 in binary: ");
		li.show(237658768);
		
		System.out.println("\nLow order 8 bits of 87987 in binary: ");
		b.show(87987);
		
		System.out.println("\nChanging 'b' to uppercase: " + i.UpCase('b'));
		System.out.println("Changing 'C' to lowercase: " + i.LowCase('C'));
		
		String message = "This is a test of encoding and decoding.";
		System.out.println("\nOriginal message: " + message);
		String message2 = li.Encode(message);
		System.out.println("Encoded message: " + message2);
		String message3 = li.Decode(message2);
		System.out.println("Decoded message: " + message3);
		
		System.out.println();
		li.ShiftDemo();
	}
}