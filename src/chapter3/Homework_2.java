package chapter3;

import java.util.Scanner;

public class Homework_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number;
		number = in.nextInt();
		int result = 0;
		int count = 0;
		int digit = number%10;
		while (digit !=0)
		{
			count++;
//			System.out.println(digit+" "+count);
			number = number/10;
			if (digit%2 == count%2)
			{
				result = result + (int)Math.pow(2, count-1);
			}
			digit = number%10;
		}
		System.out.println(result);
		in.close();
	}
}
