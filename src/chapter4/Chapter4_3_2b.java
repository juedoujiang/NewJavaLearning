package chapter4;

import java.util.Scanner;

public class Chapter4_3_2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������������Լ��
		// շת�����
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int oa = a;
		int ob = b;
//		int result = 1;
		while(b!=0)
		{
			int r = a % b;
			System.out.println(a+","+b+","+r);
			a = b;
			b = r;
		}
		System.out.println(oa + "��" + ob + "�����Լ��Ϊ" + a);
		in.close();
	}

}
