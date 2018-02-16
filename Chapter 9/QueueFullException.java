/*
  Try This 9-1
  Exceptions to the Queue class
*/

public class QueueFullException extends Exception {
	int size;
	
	QueueFullException(int s) { size = s; }
	
	public String toString() {
		return "\nQueue is full.  Maximum size is " + size;
	}
}