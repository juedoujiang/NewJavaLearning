package chapter1;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temperature;
		Scanner in = new Scanner(System.in);
		temperature = in.nextInt();
		System.out.println((int)((temperature-32)*5.0/9));
		in.close();
	}

}
