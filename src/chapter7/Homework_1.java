package chapter7;

import java.util.Scanner;

public class Homework_1 {
	
	public static boolean isPrime(int i) {
		boolean isPrime = true;
		for (int j = 2;j<i;j++)
		{
			if (i%j == 0)
			{
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	public static void factorization(int n) {
		if (isPrime(n))
		{
			System.out.print(n+"="+n);
		}
		else
		{
			System.out.print(n+"=");
			while(!isPrime(n))
			{
				for (int i = 2;i<n;i++)
				{
					if(n%i==0)
					{
						System.out.print(i+"x");
						n = n/i;
						break;
					}
				}
			}
			System.out.print(n);
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		factorization(num);
		in.close();
	}

}
