package chapter5;

import java.util.Scanner;

public class Chapter5_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int cnt = in.nextInt();
		double sum=0;
		if(cnt>0)
		{
			int[] numbers = new int[cnt];
			for (int i=0;i<cnt;i++)
			{
				numbers[i] = in.nextInt();
				sum += numbers[i];
			}
			double average = sum/cnt;
			for(int i =0;i<numbers.length;i++)
			{
				if(numbers[i]>average)
				{
					System.out.println(numbers[i]);
				}
			}
		}
		in.close();
	}

}
