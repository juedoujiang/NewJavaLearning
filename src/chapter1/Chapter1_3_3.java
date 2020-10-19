package chapter1;

import java.util.Scanner;

public class Chapter1_3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int foot;
		double inch;
		foot = (int)(30/3.0);
		System.out.print(foot);
		Scanner in = new Scanner(System.in);
		foot = in.nextInt();
		inch = in.nextInt();
		System.out.print((int)((foot+inch/12)*0.3048*100)+"cm");
		in.close();
	}

}
