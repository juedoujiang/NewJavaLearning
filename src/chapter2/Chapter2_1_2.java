package chapter2;

import java.util.Scanner;

public class Chapter2_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		��ʼ��
		Scanner in = new Scanner(System.in);
//		����Ͷ�ҽ��
		System.out.print("��Ͷ�ң�");
		int amount = in.nextInt();
		if (amount >= 10)
		{
	//		��ӡ��Ʊ
			System.out.println("*****************");
			System.out.println("* Java�Ǽ���·ר�� *");
			System.out.println("*   ��ָ����λƱ   *");
			System.out.println("*    Ʊ�ۣ�10Ԫ   *");
			System.out.println("*****************");
	//		���㲢��ӡ����
			System.out.println("���㣺"+(amount-10));
		}
		in.close();
	}

}
