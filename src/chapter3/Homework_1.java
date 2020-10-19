package chapter3;

import java.util.Scanner;

public class Homework_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number;
		int oddcount = 0;
		int evencount = 0;
		number = in.nextInt();
		while(number != -1)
		{
			if (number%2 != 0)
			{
				oddcount ++;
			}
			else
			{
				evencount ++;
			}
			number = in.nextInt();
		}
		System.out.println(oddcount + " " +evencount);
		in.close();
	}

}
