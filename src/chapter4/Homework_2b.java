package chapter4;

import java.util.Scanner;

public class Homework_2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int count = 0;
		int digit;
		if(num == 0)
		{
			System.out.print("ling");
		}
		if(num < 0)
		{
			System.out.print("fu ");
			num = -num;
		}
		for(int num_tmp = num;num_tmp != 0;)
		{
			count++;
			num_tmp = num_tmp/10;
		}
		for(int i=count-1;i>=0;i--)
		{
			digit = num/((int)Math.pow(10,i));
			num = num%(int)Math.pow(10, i);
			switch(digit)
			{
			case 0:System.out.print("ling");break;
			case 1:System.out.print("yi");break;
			case 2:System.out.print("er");break;
			case 3:System.out.print("san");break;
			case 4:System.out.print("si");break;
			case 5:System.out.print("wu");break;
			case 6:System.out.print("liu");break;
			case 7:System.out.print("qi");break;
			case 8:System.out.print("ba");break;
			case 9:System.out.print("jiu");break;
			default:break;
			}
			if(i>=1)
			{
				System.out.print(" ");
			}
		}
		in.close();
	}

}
