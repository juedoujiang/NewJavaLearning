package chapter2;

import java.util.Scanner;

public class Homework_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		¶ÁÈëÊı¾İ
		Scanner in = new Scanner(System.in);
		int BJT = in.nextInt();
		if (BJT < 800)
		{
			System.out.println(BJT+1600);
		}
		else
		{
			System.out.println(BJT-800);
		}
		in.close();
	}

}
