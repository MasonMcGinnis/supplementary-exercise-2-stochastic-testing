package edu.pitt.cs;

public class IntegerOps {
	/**
	 * Computes the sum of x and y. On integer overflow, where the return value
	 * becomes larger than Integer.MAX_VALUE or less than Integer.MIN_VALUE, 0 is
	 * returned instead.
	 * 
	 * @param x First integer
	 * @param y Second integer
	 * @return Sum of x and y, or 0 if integer overflow
	 */
	public static int add(int x, int y) {
		// TODO: Fix bug!
		long sum = (long) x + y;
		if(sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE)
			return 0;
		
		return (int) sum;

		
		
	}

	/**
	 * Computes the different of x and y. On integer overflow, where the return
	 * value becomes larger than Integer.MAX_VALUE or less than Integer.MIN_VALUE,
	 * 0 is returned instead.
	 * 
	 * @param x First integer
	 * @param y Second integer
	 * @return Difference between x and y, or 0 if integer overflow
	 */
	public static int subtract(int x, int y) {
		// TODO: Fix bug!
		long diff = (long) x - y;
		if(diff > Integer.MAX_VALUE || diff < Integer.MIN_VALUE)
			return 0;
		
		return (int) diff;

	}
}
