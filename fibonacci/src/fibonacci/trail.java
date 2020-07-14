package fibonacci;

import java.util.Scanner;

public class trail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int limit = 8;
		int j = 0;

		Scanner in = new Scanner(System.in);
		long[] series = new long[limit];

		series[0] = 1;
		series[1] = 1;

		for (int i = 2; i < limit; i++) {
			series[i] = series[i - 1] + series[i - 2];
		}

		System.out.println("Fibonacci Series upto " + limit);
		System.out.print("   ");
		for (int i = 0; i < limit; i++) {
			System.out.print(series[i] + " ");
		}
		System.out.println();
		while (1 > 0) {
			int scanin = in.nextInt();
			System.out.print("   ");
//			while (j < limit) {
				
//				if (series[j] == scanin) 
//				{
					for (int i = 0; i < limit; i++) 
					{
						if (series[i] == scanin)
						{
							System.out.print(1 + " ");
						} 
						else 
						{
							System.out.print(0 + " ");
						}
					}
					System.out.println();
//				} 
//				else 
//				{

//				}

				j++;
//			}
		}

	}

}
