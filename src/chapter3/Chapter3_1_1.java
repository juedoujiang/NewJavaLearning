package chapter3;

import java.util.Scanner;

public class Chapter3_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		��ʼ��
		Scanner in = new Scanner(System.in);
		int balance = 0;
	//		����Ͷ�ҽ��
		System.out.print("��Ͷ�ң�");
		int amount = in.nextInt();
		balance = balance + amount;
		if(balance >= 10)
		{
	//		��ӡ��Ʊ
			System.out.println("*****************");
			System.out.println("* Java�Ǽ���·ר�� *");
			System.out.println("*   ��ָ����λƱ   *");
			System.out.println("*    Ʊ�ۣ�10Ԫ   *");
			System.out.println("*****************");
	//		���㲢��ӡ����
			System.out.println("���㣺"+(balance-10));
			balance = 0;
		}
		in.close();

	}

}
