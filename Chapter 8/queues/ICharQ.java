/*
  Try This 8-1
  ICharQ.java
  Interface Definition
*/
package queues;

public interface ICharQ {
	void put(char ch);
	char get();
	void reset();
	static char[] copy(char b[]) {
		int bLen = b.length;
		char[] ch = new char[bLen];
		
		for (int i=0; i<bLen; i++) ch[i] = b[i];
		return ch;
	}
}