package chapter4;

import java.util.Scanner;

public class Chapter4_3_1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��1/n��ǰn���
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double result = 0.0;
		for (int i = 1;i<=n;i++)
		{
			result = result + 1.0/i;
		}
		System.out.println(result);
		System.out.printf("%.2f", result);
		in.close();

	}

}
