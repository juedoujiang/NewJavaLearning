package chapter6;

import java.util.Scanner;

public class Chapter6_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s1 = new String("Hello");
		String s2;
		s2 = in.next();
		System.out.println(s2);
		System.out.println(s2 == "bye");
		System.out.println(s2.equals("bye"));
		System.out.println(s1+12+24);
		in.close();
	}

}
