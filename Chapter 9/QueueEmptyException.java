/*
  Try This 9-1
  Exceptions to the Queue class
*/

public class QueueEmptyException extends Exception {
	
	public String toString() {
		return "\nQueue is empty.";
	}
}