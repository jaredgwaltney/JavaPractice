/*
 Chapter 6 Self Test
 Question #3.  Stack class
*/

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
		
		for (int i=0; i<a.length; i++) 
			push(a[i]);
	}
	
	void push(char ch) {
		if (stackTop == (s.length)) {
			System.out.println("- Stack is full.");
			return;
		}
		s[stackTop++] = ch;
	}
	
	char pop() {
		if (stackTop == 0) {
			System.out.println("- Stack is empty.");
			return (char) 0;
		}
		return s[--stackTop];
	}
	
}

class StackDemo {
	public static void main(String args[]) {
		int i;
		Stack s1 = new Stack(10);
		
		for (i=0; i<10; i++)
			s1.push((char) ('A' + i));
		
		s1.push('Z');
		
		for (i=0; i<10; i++)
			System.out.print(s1.pop());
		System.out.println();
		s1.pop();
		
		char name[] = {'T', 'o', 'm'};
		Stack s2 = new Stack(name);
		Stack s3 = new Stack(s2);
		
		s2.pop();
		s2.push('d');
		
		for (i=0; i<3; i++)
			System.out.print(s2.pop());
		System.out.println();
		
		for (i=0; i<3; i++)
			System.out.print(s3.pop());
		System.out.println();
	}
}
	