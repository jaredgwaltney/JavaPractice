/*
  Try This 9-1
  Exceptions to the Queue class
*/

public interface ICharQ {
	void put(char ch) throws QueueFullException;
	char get() throws QueueEmptyException;
	void reset();
}