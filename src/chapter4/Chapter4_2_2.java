package chapter4;

import java.util.Scanner;

public class Chapter4_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 输出100以内的素数
		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
		for (int n=2;n<100;n++)
		{
			int isPrime = 1;
			for(int i = 2; i<n; i++)
			{
				if(n%i==0)
				{
					isPrime = 0;
//					System.out.println(n+"不是素数");
					break;
				}
			}
			if(isPrime ==1)
			{
				System.out.print(n+" ");
			}
		}
		in.close();
	}

}
