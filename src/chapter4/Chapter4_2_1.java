package chapter4;

import java.util.Scanner;

public class Chapter4_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ж������Ƿ�Ϊ����
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int isPrime = 1;
		for(int i = 2; i<n; i++)
		{
			if(n%i==0)
			{
				isPrime = 0;
				System.out.println(n+"��������");
				break;
			}
		}
		if(isPrime == 1)
		{
			System.out.println(n+"������");
		}
		in.close();
	}

}
