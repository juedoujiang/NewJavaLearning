package chapter6;

import java.util.Scanner;

public class Chapter6_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��Сдת��
		Scanner in = new Scanner(System.in);
		char a = 'B';
		char b = a++;
		char c = 'A';
		char d = (char)(c+'a'-'A');
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		in.close();
	}

}
