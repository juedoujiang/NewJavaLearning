package chapter5;

import java.util.Scanner;

public class Chapter5_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ͶƱͳ��
		// дһ����������������ȷ����[0��9]��Χ�ڵ�������
		// ͳ��ÿһ�����ֳ��ֵĴ���������-1��ʾ����
		Scanner in = new Scanner(System.in);
		int x;
		int[] numbers = new int[10];
		x = in.nextInt();
		while(x!=-1)
		{
			if(x>=0&&x<=9)
			{
				numbers[x]++;
			}
			x = in.nextInt();
		}
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(i+":"+numbers[i]);
		}
		in.close();
	}

}
