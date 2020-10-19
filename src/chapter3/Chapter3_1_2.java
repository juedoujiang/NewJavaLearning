package chapter3;

import java.util.Scanner;

public class Chapter3_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 计算数的长度
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int count = 0;
		while (number > 0) //若number=0，则会输出错误的结果
		{
			number = number / 10;
			count = count + 1;
		}
		System.out.println(count);
		in.close();
	}
}
