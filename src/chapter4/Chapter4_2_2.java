package chapter4;

import java.util.Scanner;

public class Chapter4_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���100���ڵ�����
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
//					System.out.println(n+"��������");
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
