package chapter7;

import java.util.Scanner;

public class Chapter7_1_1a {
	//�������
	
	public static boolean isPrime(int i)
	{
		boolean isPrime = true;
		for (int k=2;k<i;k++)
		{
			if(i%k==0)
			{
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		if(m==1) m=2;
		int cnt=0;
		int sum=0;
		for(int i = m;i<=n;i++)
		{

			if(isPrime(i))
			{
				cnt++;
				sum+=i;
			}
		}
		System.out.println("��"+m+"��"+n+"֮����+"+cnt+"������,�ܺ�Ϊ"+sum);
		in.close();
	}

}