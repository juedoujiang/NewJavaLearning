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
		System.out.print("������Ʊ�棺");
		amount = in.nextInt();
		System.out.print("�������");
		price = in.nextInt();
//		System.out.println("echo:" + in.nextLine());	
		System.out.println(amount + "-" + price + "="+(amount-price));
		in.close();
	}
}