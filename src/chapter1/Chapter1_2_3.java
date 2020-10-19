package chapter1;

import java.util.Scanner;

public class Chapter1_2_3 {

	public static void main(String[] args) {
		System.out.println("HelloWorld");
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int amount = 100;
		int price = 0;
//		System.out.println(price);
		System.out.print("请输入票面：");
		amount = in.nextInt();
		System.out.print("请输入金额：");
		price = in.nextInt();
//		System.out.println("echo:" + in.nextLine());	
		System.out.println(amount + "-" + price + "="+(amount-price));
		in.close();
	}
}