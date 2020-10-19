package chapter5;

import java.util.Scanner;

public class Chapter5_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 投票统计
		// 写一个程序，输入数量不确定的[0，9]范围内的整数，
		// 统计每一种数字出现的次数，输入-1表示结束
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
