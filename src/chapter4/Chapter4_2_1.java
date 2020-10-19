package chapter4;

import java.util.Scanner;

public class Chapter4_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 判断输入是否为素数
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int isPrime = 1;
		for(int i = 2; i<n; i++)
		{
			if(n%i==0)
			{
				isPrime = 0;
				System.out.println(n+"不是素数");
				break;
			}
		}
		if(isPrime == 1)
		{
			System.out.println(n+"是素数");
		}
		in.close();
	}

}
