/*
 Chapter 9 Self Test
 Question #10.  Expand Stack class to have custom exceptions for full and empty conditions
*/
class StackFullException extends Exception {
	int size;
	
	StackFullException(int s) { size = s; }
	
	public String toString() {
		return "\nStack full, can only have " + size + " items.";
	}
}

class StackEmptyException extends Exception {
	public String toString() {
		return "\nStack is empty.";
	}
}
		
class Stack {
	private char s[];
	private int stackTop;
	
	Stack(int size) {
		s = new char[size];
		stackTop = 0;
	}
	
	Stack(Stack ob) {
		stackTop = ob.stackTop;
		s = new char[ob.s.length];
		
		for (int i=0; i<ob.stackTop; i++)
			s[i] = ob.s[i];
	}
	
	Stack(char a[]) {
		stackTop = 0;
		s = new char[a.length];
		
		try {
			for (int i=0; i<a.length; i++) 
				push(a[i]);
		}
		catch (StackFullException exc) {
			System.out.println(exc);
		}
	}
	
	void push(char ch) throws StackFullException {
		if (stackTop == (s.length)) {
			throw new StackFullException(s.length);
		}
		s[stackTop++] = ch;
	}
	
	char pop() throws StackEmptyException {
		if (stackTop == 0) {
			throw new StackEmptyException();
		}
		return s[--stackTop];
	}
	
}

class StackDemo {
	public static void main(String args[]) {
		int i;
		Stack s1 = new Stack(10);
		
		try {
			for (i=0; i<10; i++)
				s1.push((char) ('A' + i));
			
			s1.push('Z');
		}
		catch (StackFullException exc) {
			System.out.println(exc);
		}
		System.out.println();
		
		try {
			for (i=0; i<10; i++)
				System.out.print(s1.pop());
			System.out.println();
			s1.pop();
		}
		catch (StackEmptyException exc) {
			System.out.println(exc);
		}
		
		char name[] = {'T', 'o', 'm'};
		Stack s2 = new Stack(name);
		Stack s3 = new Stack(s2);
		
		try {
			s2.pop();
		}
		catch (StackEmptyException exc) {
			System.out.println(exc);
		}
		
		try {
			s2.push('d');
		}
		catch (StackFullException exc) {
			System.out.println(exc);
		}
		
		try {
			for (i=0; i<3; i++)
				System.out.print(s2.pop());
			System.out.println();
		
			for (i=0; i<3; i++)
				System.out.print(s3.pop());
			System.out.println();
		}
		catch (StackEmptyException exc) {
			System.out.println(exc);
		}
	}
}
	