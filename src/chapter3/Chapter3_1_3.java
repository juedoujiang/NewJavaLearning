package chapter3;

import java.util.Scanner;

public class Chapter3_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//		��ʼ��
				Scanner in = new Scanner(System.in);
				int number = in.nextInt();
				int count = 0;
				do				
				{
					number = number / 10;
					count = count + 1;
				}while (number > 0);
				System.out.println(count);
				in.close();
	}

}
