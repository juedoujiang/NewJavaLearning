package chapter3;

import java.util.Scanner;

public class Chapter3_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������ĳ���
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int count = 0;
		while (number > 0) //��number=0������������Ľ��
		{
			number = number / 10;
			count = count + 1;
		}
		System.out.println(count);
		in.close();
	}
}
