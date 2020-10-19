package chapter4;

import java.util.Scanner;

public class Homework_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 第n个和第m个素数之间素数和
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int count = 0;
		int sum = 0;
		for(int num=2;;num++)
		{
			int isPrime = 1;
			for(int j=2;j<=Math.sqrt(num);j++)
			{
				if (num%j == 0)
				{
					isPrime = 0;
					break;
				}
			}
			if (isPrime == 1)
			{
				count++;
				if(count>=n&&count<=m)
				{
					sum+=num;
				}
				if(count>m)
				{
					break;
				}
			}
	    }
		System.out.print(sum);
		in.close();
	}

}
