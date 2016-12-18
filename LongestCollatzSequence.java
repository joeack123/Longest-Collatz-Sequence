/*
Collatz Sequence is a mathematical equation that states if 
n is even take n / 2 and repeat till n is odd and when
n is odd take n * 3 and add 1. Then this repeats till the 
output is equal to 1. In my program it takes a user 
inputed value and will run it through this process from 
every number from 1 to the value inputed. After it finishes
it outputs the value that took the longest time to execute
and prints it out and the value that it was at as well as
the time in milliseconds it took to reach that result.
*/


import java.util.Scanner;

public class longestcollatzsequence {
	public static void main(String args[]) {
		long i, j, n, max = 0, pos = 0, x, y;
		long counter = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the positive integer:");
		while (s.hasNextLong()) {
			x = System.currentTimeMillis();
			i = s.nextLong();
			long arr[] = new long[50000000];
			long arrlng = arr.length;
			for(j = 1; j <= i; j++) {
				n = j;
				counter = 0;
				while(n != 1) {
					if(n < arrlng) {
						if(arr[(int) (n - 1)] != 0) {
							counter = counter + arr[(int) (n - 1)];
							break;
						}
					}
					n = ((n & 1) == 0 ? n / 2 : (3 * n) + 1);
					counter++;
				}
				if(j < arrlng)
					arr[(int) (j - 1)] = counter;
				if(counter > max) {
					max = counter;
					pos = j;
				}
				counter = 0;
			}
			y = System.currentTimeMillis();
			System.out.println("Maximum cycle length occurs at " + pos + " and the number of steps involved" + " " + max+ "\n Total time taken is " + (y - x) + " " + "milliseconds");
			break;
		}
		s.close();
	}
}
