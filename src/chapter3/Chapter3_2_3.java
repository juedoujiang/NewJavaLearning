package chapter3;

import java.util.Scanner;

public class Chapter3_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������Ϸ
		Scanner in = new Scanner(System.in);
		int number = (int)(Math.random()*100+1); //[0,1) -->[0,100) -->[1,100]
		int input;
		int count = 0;
		do
		{
			input = in.nextInt();
			count = count+1;
			if (input>number)
			{
				System.out.println("ƫ��");
			}
			else if(input<number)
			{
				System.out.println("ƫС");
			}
		}while(input!=number);
		System.out.println("��ϲ��¶��ˣ������"+count+"��");
		in.close();
	}

}
