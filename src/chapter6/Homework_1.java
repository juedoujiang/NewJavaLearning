package chapter6;

import java.util.Scanner;

public class Homework_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] num = new int[100];
		int count = 0;
		for (int i = 0;;i++)
		{
			String str = in.next();
			num[i] = str.length();
			count ++;
			if (str.indexOf('.') == str.length()-1)
			{
				break;
			}
		}
		for (int i = 0; i<count ;i++)
		{
			if (i < count-1)
			{
				System.out.print(num[i]+" ");
			}
			else
			{
				if (num[i] - 1 != 0)
				{
					System.out.print(num[i]-1);
				}
				else
				{
					System.out.print("");
				}
			}
		}
		in.close();
	}

}
