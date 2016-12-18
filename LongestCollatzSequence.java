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
			long al = arr.length;
			for(j = 1; j <= i; j++) {
				n = j;
				counter = 0;
				while(n != 1) {
					if(n < al) {
						if(arr[(int) (n - 1)] != 0) {
							counter = counter + arr[(int) (n - 1)];
							break;
						}
					}
					n = ((n & 1) == 0 ? n / 2 : (3 * n) + 1);
					counter++;
				}
				if(j < al)
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
