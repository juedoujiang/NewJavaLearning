package chapter5;

import java.util.Scanner;

public class Chapter5_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] numbers = new int[100];
		int cnt = 0;
		double sum=0;
		while(num != -1)
		{
			numbers[cnt] = num;
			sum += num;
			cnt++;
			num = in.nextInt();
		}
		if(cnt>0)
		{
			double average = sum/cnt;
			for(int i =0;i<cnt;i++)
			{
				if(numbers[i]>average)
				{
					System.out.println(numbers[i]);
				}
			}
		}
		System.out.println(sum/cnt);
		in.close();
	}

}
