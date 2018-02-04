/*
 Try This 4-1
*/

class Help {
	
	void showMenu() {		
		System.out.println("Help on:");
		System.out.println("\t1. if");
		System.out.println("\t2. switch");
		System.out.println("\t3. for loop");
		System.out.println("\t4. while loop");
		System.out.println("\t5. do while loop");
		System.out.println("\t6. break");
		System.out.println("\t7. continue\n");
		System.out.print("Choose one (q to quit): ");
	}
	
	boolean isValid(int ch) {
		if (ch < '1' | ch > '7' & ch != 'q') return false;
		else return true;
	}
	
	void helpOn(int what) {
		switch(what) {
			case '1':
				System.out.println("The if:\n");
				System.out.println("if (expression) statement");
				System.out.println("else statement");
				break;
			case '2':
				System.out.println("The switch:\n");
				System.out.println("switch (expression) {");
				System.out.println("  case constant:");
				System.out.println("    statement sequence");
				System.out.println("    break;");
				System.out.println("  // ...");
				System.out.println("}");
				break;
			case '3':
				System.out.println("The for loop:\n");
				System.out.println("for (initialization; condition; iteration) {");
				System.out.println("  statement sequence");
				System.out.println("}");
				break;
			case '4':
				System.out.println("The while loop:\n");
				System.out.println("while (condition) {");
				System.out.println("  statement sequence");
				System.out.println("}");
				break;
			case '5':
				System.out.println("The do while loop:\n");
				System.out.println("do {");
				System.out.println("  statement sequence");
				System.out.println("} while (condition);");
				break;
			case '6':
				System.out.println("The break:\n");
				System.out.println("break; or break label;");
				break;
			case '7':
				System.out.println("The continue:\n");
				System.out.println("continue; or continue label;");
				break;
		}
		System.out.println();
	}
}

class HelpClassDemo {
	public static void main(String args[]) throws java.io.IOException {
		char choice, ignore;
		Help h1pobj = new Help();
		
		for(;;) {
			do {
				h1pobj.showMenu();
				choice = (char) System.in.read();
				
				do {
					ignore = (char) System.in.read();
				} while (ignore != '\n');
			} while (!h1pobj.isValid(choice));
			
			if (choice == 'q') break;
			
			System.out.println("\n");
			
			h1pobj.helpOn(choice);
		}
	}
}