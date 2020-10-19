package chapter3;

import java.util.Scanner;

public class Chapter3_2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ÕûÊý²ð·Ö
		Scanner in = new Scanner(System.in);
		int number;
		int result = 0;
		number = in.nextInt();
		do
		{
			int digit = number%10;
			result = result*10+digit;
			number = number/10;
		}while(number>0);
		System.out.println(result);
		in.close();
	}

}
