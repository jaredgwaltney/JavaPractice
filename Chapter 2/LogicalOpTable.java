/* 
 Try This 2-2
 Display a truth table for the logical operators.
*/

class LogicalOpTable {
	public static void main(String args[]) {
		boolean p, q;
		
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		
		p = true; q = true;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		p = true; q = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		p = false; q = true;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		p = false; q = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		System.out.println();
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		
		p = true; q = true;
		if (p) System.out.print("1"); else System.out.print("0");  System.out.print("\t");
		if (q) System.out.print("1"); else System.out.print("0");  System.out.print("\t");
		if (p&q) System.out.print("1"); else System.out.print("0");  System.out.print("\t");
		if (p|q) System.out.print("1"); else System.out.print("0");  System.out.print("\t");
		if (p^q) System.out.print("1"); else System.out.print("0");  System.out.print("\t");
		if (!p) System.out.print("1"); else System.out.print("0");  System.out.print("\n");
		
		p = true; q = false;
		if (p) System.out.print("1"); else System.out.print("0");  System.out.print("\t");
		if (q) System.out.print("1"); else System.out.print("0");  System.out.print("\t");
		if (p&q) System.out.print("1"); else System.out.print("0");  System.out.print("\t");
		if (p|q) System.out.print("1"); else System.out.print("0");  System.out.print("\t");
		if (p^q) System.out.print("1"); else System.out.print("0");  System.out.print("\t");
		if (!p) System.out.print("1"); else System.out.print("0");  System.out.print("\n");
		
		p = false; q = true;
		if (p) System.out.print("1"); else System.out.print("0");  System.out.print("\t");
		if (q) System.out.print("1"); else System.out.print("0");  System.out.print("\t");
		if (p&q) System.out.print("1"); else System.out.print("0");  System.out.print("\t");
		if (p|q) System.out.print("1"); else System.out.print("0");  System.out.print("\t");
		if (p^q) System.out.print("1"); else System.out.print("0");  System.out.print("\t");
		if (!p) System.out.print("1"); else System.out.print("0");  System.out.print("\n");
		
		p = false; q = false;
		if (p) System.out.print("1"); else System.out.print("0");  System.out.print("\t");
		if (q) System.out.print("1"); else System.out.print("0");  System.out.print("\t");
		if (p&q) System.out.print("1"); else System.out.print("0");  System.out.print("\t");
		if (p|q) System.out.print("1"); else System.out.print("0");  System.out.print("\t");
		if (p^q) System.out.print("1"); else System.out.print("0");  System.out.print("\t");
		if (!p) System.out.print("1"); else System.out.print("0");  System.out.print("\n");
	}
}