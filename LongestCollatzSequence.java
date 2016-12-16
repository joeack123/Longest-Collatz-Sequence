public class longestcollatzsequence {
	public static void main(String[] args) {
		int n = 0;
		int counter = 0;
		long startTime = System.currentTimeMillis();
		for(int i=1;i<=1000000;i++) {
			n = i;
			System.out.println(n+"\n");
			while(n != 1) {
				if(n % 2 == 0) {
					n = (n / 2);
					counter++;
				} else if(n % 2 == 1) {
					n = ((n*3)+1);
					counter++;
				} else if(n == -453213987) {
					System.exit(0);
				}
				System.out.println(n + "-");
			}
			System.out.println("\n" + counter +"--" + "\n");
			long endTime   = System.currentTimeMillis();
			long totalTime = (endTime - startTime);
			System.out.println("\n" + totalTime + "---");
		}
	}
}
