package chapter4;

import java.util.Scanner;

public class Chapter4_3_2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �����������Լ��
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int result = 1;
		for (int i=2;i<=a&&i<=b;i++)
		{
			if(a%i==0&&b%i==0)
			{
				result = i;
			}
		}
		System.out.println(a + "��" + b + "�����Լ��Ϊ" + result);
		in.close();
	}

}
