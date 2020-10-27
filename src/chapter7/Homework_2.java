package chapter7;

import java.util.Scanner;

public class Homework_2 {
	public static boolean isPN(int n) {
		boolean isPN = false;
		int sum = 0;
		for (int i=1;i<=n/2;i++) 
		{
			if(n%i==0)
			{
				sum += i;
			}
		}
		if (n == sum)
		{
			isPN = true;
		}
		return isPN;
	}
	public static void numofperfectnum(int a, int b)
	{
		int cnt=0;
		for (int i = a;i<b;i++ )
		{
			if (isPN(i))
			{
				cnt++;
			}
		}
		if (cnt == 0)
		{
			System.out.println();
		}
		for (int i = a;i<b;i++)
		{
			if (isPN(i))
			{
				System.out.print(i);
				cnt--;
				if (cnt>0)
				{
					System.out.print(" ");
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		numofperfectnum(a, b);
		in.close();
	}

}
