/*
 Chapter 6 Self Test
 Question #13:  Create a varargs test that sums the integers passed to it and returns the results.
*/

class VariableArguments {
	static int addArgs(int ... a) {
		int sum = 0;
		
		for (int i=0; i<a.length; i++)
			sum += a[i];
		
		return sum;
	}
	
	public static void main(String args[]) {
		System.out.println(addArgs(1, 2, 3, 4, 5, 6));
		System.out.println(addArgs(100, 200, 300));
		System.out.println(addArgs(47, 13, 89, 4));
	}
}
	