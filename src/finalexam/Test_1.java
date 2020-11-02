package finalexam;

import java.util.Scanner;

public class Test_1 {
	// 求二进制的前导的零（输入考虑负数，输入数的范围在-2^31~2^31-1）
	public static String BinToDec(int dec) {
		String bin = "";
		while(dec!=0)
		{
			bin = dec%2 + bin;
			dec /= 2;
		}
		return bin;
	}
	public static String BinToDec2(int dec) {
		String bin = "";
		int n = 0;
		for (int i = 31;i>=0;i--)
		{
			n = dec >>> i & 1;
			bin = bin + n;
		}
		n = Integer.valueOf(bin);
		bin = String.valueOf(n);
		return bin;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int dec = in.nextInt();
		int result = 0;
		String bin = Integer.toBinaryString(dec);
//		String bin = BinToDec(dec);
//		String bin = BinToDec2(dec);
//		System.out.println(bin);
		result = 32 - bin.length();
		if (dec != 0)
		{
			System.out.print(result);
		}
		else
		{
			System.out.print(32);
		}
		in.close();
	}

}
