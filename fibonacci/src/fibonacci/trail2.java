package fibonacci;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class trail2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int limit = 8;

		Scanner in = new Scanner(System.in);
		int[] series = new int[limit];
		ArrayList<Number> arr = new ArrayList<Number>();

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
		while (1 > 0) 
		{
			int scanin = in.nextInt();
			System.out.print("   ");
			
			for (int i = 0; i < limit; i++)
			{
				if(series[i] < scanin)
				{
					arr.add(series[i]);
					
				}
				else
					break;
			}
		
			System.out.println();
			System.out.println(arr.size());
			for(int i = 0; i < arr.size(); i++)
			{
				System.out.print(arr.get(i)+" ");
			}
			System.out.println();
		}
		

	}

}
